package com.example.beritaku.api;

public class Server {
    public static final String URL_API = "https://newsapi.org/";

    public static ApiService getApiService(){
        return ApiClient.getClient(URL_API).create(ApiService.class);
    }
}