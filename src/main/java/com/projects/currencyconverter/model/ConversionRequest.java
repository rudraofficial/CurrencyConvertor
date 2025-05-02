package com.projects.currencyconverter.model;

import lombok.Data;

@Data
public class ConversionRequest {
    String from;
    String to;
    Double amount;
}
