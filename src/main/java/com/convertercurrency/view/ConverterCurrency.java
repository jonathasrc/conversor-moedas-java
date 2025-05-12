package com.convertercurrency.view;

import com.convertercurrency.ExchangeRateAPI;
import com.convertercurrency.controller.ExchangeCurrencyService;
import com.google.gson.Gson;

import java.io.IOException;

public class ConverterCurrency {
    public static void main(String[] args) throws IOException, InterruptedException {
        var converter = new ExchangeCurrencyService().getRates();
        System.out.println(converter);


    }
}
