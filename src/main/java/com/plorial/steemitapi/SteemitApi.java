package com.plorial.steemitapi;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.plorial.steemitapi.pojo.Discussion;
import com.plorial.steemitapi.pojo.Request;
import com.plorial.steemitapi.pojo.Response;
import javafx.util.Pair;
import org.java_websocket.client.DefaultSSLWebSocketClientFactory;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by plorial on 12/26/16.
 */
public class SteemitApi extends WebSocketClient {

    private static final String SOCKET = "wss://node.steem.ws/";

    public Discussions discussions;

    Map<Integer,MessageListener> listeners;

    List<String> requestQueue;

    private boolean isConnected = false;

    public SteemitApi() throws URISyntaxException {
        super(new URI(SOCKET));
        discussions = new Discussions();
        requestQueue = new ArrayList<>();
        listeners = new HashMap<>();
        SSLContext sslContext = null;

        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return new java.security.cert.X509Certificate[]{};
            }
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
        }};
        try {
            sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        setWebSocketFactory(new DefaultSSLWebSocketClientFactory(sslContext));
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        System.out.println("Opened " + handshakedata.getHttpStatusMessage());
        isConnected = true;
        for (String s: requestQueue) {
            send(s);
        }
    }

    @Override
    public void onMessage(String message) {
        Gson gson = new Gson();
        Response response = gson.fromJson(message,Response.class);
        MessageListener listener = listeners.get(response.getId());
        if(listener != null) {
            Type type = listener.getClass().getDeclaredMethods()[0].getGenericParameterTypes()[0];
            listener.onMessageReceived(gson.fromJson(response.getResult().toString(), type));
            listeners.remove(response.getId());
        }
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("Connection closed " + reason + " code - " + code + " remote - " + remote);
        isConnected = false;
    }

    @Override
    public void onError(Exception ex) {
        ex.printStackTrace();
    }

    public void addRequest(MessageListener listener, String method, Pair<String, String>... params){
        listeners.put(listener.hashCode(), listener);
        Request request = new Request();
        request.setId(listener.hashCode());
        request.setMethod(method);
        JsonArray array = new JsonArray();
        JsonObject jsonProperty = new JsonObject();
        for (Pair<String, String> p : params) {
            jsonProperty.addProperty(p.getKey(), p.getValue());
        }
        array.add(jsonProperty);
        request.setParams(array);
        Gson gson = new Gson();

        if(isConnected){
            send(gson.toJson(request));
        }else {
            connect();
            requestQueue.add(gson.toJson(request));
        }
    }

    class Discussions{
        void getDiscussionsByActive(MessageListener<List<Discussion>> listener, String tag, int limit){
            addRequest(listener,"get_discussions_by_active", new Pair<String, String>("tag", tag), new Pair<String, String>("limit", String.valueOf(limit)));
        }
    }

    interface MessageListener<T> {
        void onMessageReceived(T t);
    }
}
