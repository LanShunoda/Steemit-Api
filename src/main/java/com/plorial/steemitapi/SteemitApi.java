package com.plorial.steemitapi;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.plorial.steemitapi.pojo.*;
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
    public Accounts accounts;
    public Block block;
    public Content content;
    public Categories categories;
    public Witness witness;

    Map<Integer,MessageListener> listeners;

    List<String> requestQueue;

    private boolean isConnected = false;

    public SteemitApi() throws URISyntaxException {
        super(new URI(SOCKET));
        discussions = new Discussions();
        accounts = new Accounts();
        block = new Block();
        content = new Content();
        categories = new Categories();
        witness = new Witness();

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
        void getDiscussionByAuthorBeforeDate(MessageListener<List<Discussion>> listener, String tag, int limit,
                                             String startPermalink, int beforeDate){
            addRequest(listener,"get_discussions_by_author_before_date", new Pair<String, String>("tag", tag)
                    , new Pair<String, String>("start_permalink", startPermalink)
                    , new Pair<String, String>("before_date", String.valueOf(beforeDate))
                    , new Pair<String, String>("limit", String.valueOf(limit)));
        }
        void getDiscussionsByCashout(MessageListener<List<Discussion>> listener, String tag, int limit){
            addRequest(listener,"get_discussions_by_cashout", new Pair<String, String>("tag", tag), new Pair<String, String>("limit", String.valueOf(limit)));
        }
        void getDiscussionsByChildren(MessageListener<List<Discussion>> listener, String tag, int limit){
            addRequest(listener,"get_discussions_by_children", new Pair<String, String>("tag", tag), new Pair<String, String>("limit", String.valueOf(limit)));
        }
        void getDiscussionsByCreated(MessageListener<List<Discussion>> listener, String tag, int limit){
            addRequest(listener,"get_discussions_by_created", new Pair<String, String>("tag", tag), new Pair<String, String>("limit", String.valueOf(limit)));
        }
        void getDiscussionsByFeed(MessageListener<List<Discussion>> listener, String tag, int limit){
            addRequest(listener,"get_discussions_by_feed", new Pair<String, String>("tag", tag), new Pair<String, String>("limit", String.valueOf(limit)));
        }
        void getDiscussionsByHot(MessageListener<List<Discussion>> listener, String tag, int limit){
            addRequest(listener,"get_discussions_by_hot", new Pair<String, String>("tag", tag), new Pair<String, String>("limit", String.valueOf(limit)));
        }
        void getDiscussionsByPayout(MessageListener<List<Discussion>> listener, String tag, int limit){
            addRequest(listener,"get_discussions_by_payout", new Pair<String, String>("tag", tag), new Pair<String, String>("limit", String.valueOf(limit)));
        }
        void getDiscussionsByTrending(MessageListener<List<Discussion>> listener, String tag, int limit){
            addRequest(listener,"get_discussions_by_trending", new Pair<String, String>("tag", tag), new Pair<String, String>("limit", String.valueOf(limit)));
        }
        void getDiscussionsByVoted(MessageListener<List<Discussion>> listener, String tag, int limit){
            addRequest(listener,"get_discussions_by_votes", new Pair<String, String>("tag", tag), new Pair<String, String>("limit", String.valueOf(limit)));
        }
    }

    class Accounts{
        void getAccountsCount(MessageListener<Integer> listener){
            addRequest(listener,"get_account_count");
        }
        void getAccountVotes(MessageListener<Integer> listener, String account){
            addRequest(listener,"get_account_votes", new Pair<String, String>("account", account));
        }
        void getAccounts(MessageListener<List<Account>> listener, String account){
            addRequest(listener,"get_account_votes", new Pair<String, String>("account", account));
        }
    }

    class Block{
        void getBlock(MessageListener<Block> listener, int number){
            addRequest(listener,"get_block", new Pair<String, String>("number", String.valueOf(number)));
        }
        void getBlockHeader(MessageListener<BlockHeader> listener, int number){
            addRequest(listener,"get_block_header", new Pair<String, String>("number", String.valueOf(number)));
        }
    }

    class Content{
        void getContent(MessageListener<Discussion> listener, String account){
            addRequest(listener,"get_content", new Pair<String, String>("account", account));
        }
        void getContentReplies(MessageListener<List<Discussion>> listener, String account){
            addRequest(listener,"get_content_replies", new Pair<String, String>("account", account));
        }
    }

    class Categories{
        void getTrendingCategories(MessageListener<List<BlogCategory>> listener, String tag, int limit){
            addRequest(listener,"get_trending_categories", new Pair<String, String>("tag", tag), new Pair<String, String>("limit", String.valueOf(limit)));
        }
        void getBestCategories(MessageListener<List<BlogCategory>> listener, String tag, int limit){
            addRequest(listener,"get_best_categories", new Pair<String, String>("tag", tag), new Pair<String, String>("limit", String.valueOf(limit)));
        }
        void getActiveCategories(MessageListener<List<BlogCategory>> listener, String tag, int limit){
            addRequest(listener,"get_active_categories", new Pair<String, String>("tag", tag), new Pair<String, String>("limit", String.valueOf(limit)));
        }
    }

    class Witness{
        void getActiveWitnesses(MessageListener<List<String>> listener){
            addRequest(listener,"get_active_witnesses");
        }
        void getWitnessesByAccount(MessageListener<List<String>> listener, String account){
            addRequest(listener,"get_witness_by_account", new Pair<String, String>("account", account));
        }
        void getWitnessesCount(MessageListener<Integer> listener){
            addRequest(listener,"get_witness_count");
        }
        void getWitnessesSchedule(MessageListener<List<com.plorial.steemitapi.pojo.Witness>> listener){
            addRequest(listener,"get_witness_schedule");
        }
    }

    interface MessageListener<T> {
        void onMessageReceived(T t);
    }
}
