package com.convertercurrency.view;

import com.convertercurrency.controller.ExchangeCurrencyService;

import java.io.IOException;

public class ConverterCurrency {
    public static void main(String[] args) throws IOException, InterruptedException {
        var converter = new ExchangeCurrencyService().getRates();
        System.out.println(converter);


    }
}
