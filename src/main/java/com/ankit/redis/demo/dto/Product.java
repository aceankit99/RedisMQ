package com.ankit.redis.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int qty;
    private long price;

}
