package com.ms.application.shopping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {


    private String UpcCode;
    private int price;

}
