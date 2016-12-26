package com.plorial.steemitapi;

import com.plorial.steemitapi.pojo.Discussion;

import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by plorial on 12/24/16.
 */
public class Main {
    public static void main(String[] args) throws URISyntaxException{
        SteemitApi steemitApi = new SteemitApi();
        steemitApi.discussions.getDiscussionsByActive(new SteemitApi.MessageListener<List<Discussion>>() {
            @Override
            public void onMessageReceived(List<Discussion> discussions) {
                System.out.println(discussions.get(0).getAuthor());
            }
        },"", 10);
    }
}


