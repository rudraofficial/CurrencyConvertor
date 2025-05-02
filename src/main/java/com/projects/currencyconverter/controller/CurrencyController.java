package com.projects.currencyconverter.controller;

import com.projects.currencyconverter.model.ConversionRequest;
import com.projects.currencyconverter.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/currency")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @PostMapping("/convert")
    public Map<String, Object> convert(@RequestBody ConversionRequest request) {
        double result = currencyService.convert(request.getFrom(), request.getTo(), request.getAmount());

        Map<String, Object> response = new HashMap<>();
        response.put("from", request.getFrom());
        response.put("to", request.getTo());
        response.put("originalAmount", request.getAmount());
        response.put("convertedAmount", result);

        return response;
    }
}
