package com.convertercurrency.controller;


import com.convertercurrency.ExchangeRateAPI;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeCurrencyService {
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private static final String API_KEY = "c3723c80b29238d2a509a25b";


    public ExchangeRateAPI getRates() throws IOException, InterruptedException {
        String url_str = "/latest/USD";
        URI uri = URI.create(BASE_URL + API_KEY + "/" + url_str );

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(uri).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return new Gson().fromJson(response.body(), ExchangeRateAPI.class);
    }
}
