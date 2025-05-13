package com.convertercurrency.model;

import com.convertercurrency.ExchangeRateAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExchangeCurrency {
    ExchangeRateAPI exchangeRateAPI;
    public ExchangeCurrency(ExchangeRateAPI exchangeRateAPI) {
        this.exchangeRateAPI = exchangeRateAPI;
    }

    public Map<String, Double> filteredRates(List<String> currencies) {
        if (currencies.isEmpty() || currencies.isEmpty()) {
            throw new IllegalArgumentException("Currencies cannot be empty");
        }
        return currencies.stream()
                .filter(currency ->{
                    if (!this.exchangeRateAPI.conversion_rates().containsKey(currency)) {
                        System.out.println("Currencies do not contain currency: " + currency);
                    }
                    return this.exchangeRateAPI.conversion_rates().containsKey(currency);
                })
                .collect(Collectors.toMap(currency -> currency, this.exchangeRateAPI.conversion_rates()::get));
    }

    public double converterCurrency(Double value, String currencyDestination) {
        if (!this.exchangeRateAPI.conversion_rates().containsKey(currencyDestination)) {
            throw new IllegalArgumentException("Moeda de destino '" + currencyDestination + "' não encontrada!");
        }
        double rateDest = this.exchangeRateAPI.conversion_rates().get(currencyDestination);

        return  value * rateDest;
    }

}
