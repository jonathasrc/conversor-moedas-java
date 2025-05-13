package com.convertercurrency.view;

import com.convertercurrency.controller.ExchangeCurrencyService;
import com.convertercurrency.model.ExchangeCurrency;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.*;

public class ConverterCurrency {

    public static void main(String[] args) throws IOException, InterruptedException {
        final String BASE_CURRENCY = "BRL";
        Scanner sc = new Scanner(System.in);
        var exchangeRatesJson = new ExchangeCurrencyService().getRates(BASE_CURRENCY);
        int selectedOption;

        out.println("Bem-vindo ao Conversor de Moedas");

        do {
            Map<Integer, String> options = Map.of(
                    1, "ARS",
                    2, "BOB",
                    3, "USD",
                    4, "CLP",
                    5, "COP",
                    6, "BRL"
            );
//            options.forEach((key, value) -> out.println(key + " - converter de " +
//                    BASE_CURRENCY + " para: " + value));
            out.println("Escolha uma opção:");
            out.println("1 - Converter de " + BASE_CURRENCY + " para ARS");
            out.println("2 - Converter de " + BASE_CURRENCY + " para BOB");
            out.println("3 - Converter de " + BASE_CURRENCY + " para USD");
            out.println("4 - Converter de " + BASE_CURRENCY + " para CLP");
            out.println("5 - Converter de " + BASE_CURRENCY + " para COP");
            out.println("6 - Converter de " + BASE_CURRENCY + " para BRL");
            out.println("0 - para: Sair\n");
            selectedOption = sc.nextInt();

            if (selectedOption == 0) {
                out.println("Saindo ... ");
                break;
            }

            out.println("Infome o valor para ser convertido: ");
            Double amountToConvert = sc.nextDouble();


            try {
                var exchangeCurrency = new ExchangeCurrency(exchangeRatesJson);
                out.println("--------------------------------------------------");
                out.println(STR."valor da moeda destino na conversão atual: \{exchangeCurrency
                        .getExchangeRateAPI()
                        .conversion_rates()
                        .get(options
                                .get(selectedOption))}");

                out.println("Valor convertido: " + exchangeCurrency.converterCurrency(amountToConvert,
                        options.get(selectedOption)));
                out.println("--------------------------------------------------");

            } catch (NullPointerException | IllegalArgumentException e ) {
                out.println("Erro ao converter, por favor informe o campo 'Origem Moeda' corretamente.");
                out.println(e.getMessage());
            }

        }while ( selectedOption != 0);
        sc.close();

    }
}
