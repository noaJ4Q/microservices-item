package com.example.microservicesitem.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private Product product;
    private long amount;

    public Item() {
    }

    public Item(Product product, long amount) {
        this.product = product;
        this.amount = amount;
    }
}
