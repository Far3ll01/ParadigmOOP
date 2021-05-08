package com.company;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

@SuppressWarnings("rawtypes")
public class CurrencyConverter {
    private final HashMap<String, Double> currencies;
    private boolean isRunning;

    public CurrencyConverter() {
        this.currencies = new HashMap<>();
        this.isRunning = true;
    }

    public void addCurrency(String key, double value) {
        this.currencies.put(key, value);
    }

    public void removeCurrency(String key) {
        this.currencies.remove(key);
    }

    public double convertCurrency(String currency, double value) {
        return value * this.currencies.get(currency);
    }

    public void clearAllCurrencies() {
        this.currencies.clear();
    }

    public void stopConverter() {
        this.isRunning = false;
    }

    public String showCurrencies() {
        StringBuilder temp = new StringBuilder();
        Entry pair;
        for (Entry<String, Double> stringDoubleEntry : this.currencies.entrySet()) {
            pair = stringDoubleEntry;
            temp.append(pair.getKey()).append(": ").append(pair.getValue()).append("\n");
        }
        return temp.toString();
    }

    public void runConverter() {
        Scanner input = new Scanner(System.in);
        while (this.isRunning) {
            System.out.println("""
                    Converter is running...
                    1. to add new currency
                    2. to remove currency with given code ie. 'USD'
                    3. to remove all currencies
                    4. to convert value from zl to available currency
                    Type "Stop" to close converter
                    """);
            String temp = input.nextLine();
            String tempCode;
            double tempRatio;
            double tempValue;
            switch (temp) {
                case "Stop", "stop" -> this.stopConverter();
                case "1" -> {
                    System.out.println("Please enter currency code");
                    tempCode = input.nextLine();
                    System.out.println("Please enter conversion ratio for this currency");
                    tempRatio = input.nextDouble();
                    this.addCurrency(tempCode.toUpperCase(), tempRatio);
                }
                case "2" -> {
                    System.out.println(this.showCurrencies());
                    System.out.println("Please enter available currency to remove it");
                    temp = input.nextLine();
                    this.removeCurrency(temp.toUpperCase());
                }
                case "3" -> this.clearAllCurrencies();
                case "4" -> {
                    System.out.println("Please enter available currency code");
                    System.out.println(this.showCurrencies());
                    temp = input.nextLine();
                    System.out.println("Please enter value to convert");
                    tempValue = input.nextDouble();
                    System.out.println(this.convertCurrency(temp.toUpperCase(), tempValue));
                }
            }
        }
        input.close();

    }
}
