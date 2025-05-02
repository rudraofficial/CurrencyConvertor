package com.projects.currencyconverter.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;


@Service
public class CurrencyService {

    private final String API_KEY = "3f06e5f9004fc9c3b30ec7e9"; // Replace with your key
    private final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double convert(String from, String to, double amount) {
        RestTemplate restTemplate = new RestTemplate();
        if (from.equalsIgnoreCase(to)) {
            return amount;
        }


        String url = UriComponentsBuilder.fromHttpUrl(BASE_URL + from).toUriString();

        Map<String, Object> response = restTemplate.getForObject(url, Map.class);

        if (response == null || !response.containsKey("conversion_rates")) {
            throw new RuntimeException("Invalid API response.");
        }

        Map<String, Double> rates = (Map<String, Double>) response.get("conversion_rates");
        if (!rates.containsKey(to)) {
            throw new IllegalArgumentException("Target currency not supported.");
        }

        double rate = (Double) rates.get(to);
        return amount * rate;
    }
}