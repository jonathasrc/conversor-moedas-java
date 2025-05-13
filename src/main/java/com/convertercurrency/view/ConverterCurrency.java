package com.convertercurrency.view;

import com.convertercurrency.controller.ExchangeCurrencyService;
import com.convertercurrency.model.ExchangeCurrency;

import java.io.IOException;
import java.util.List;

public class ConverterCurrency {
    public static void main(String[] args) throws IOException, InterruptedException {
        var converter = new ExchangeCurrencyService().getRates("BRL");
        List<String> selectedCurrencies = List.of("USD");

        try {
            var exchangeCurrency = new ExchangeCurrency(converter);
            System.out.println(converter.base_code());
            System.out.println(exchangeCurrency.filteredRates(selectedCurrencies));
            System.out.println(exchangeCurrency.converterCurrency(1000.0, "USD"));
        } catch (NullPointerException e){
            System.out.println("Erro ao converter, por favor informe o campo 'Origem Moeda' corretamente.");
            System.out.println(e.getMessage());
        }

    }
}
