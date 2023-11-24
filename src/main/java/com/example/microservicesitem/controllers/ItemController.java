package com.example.microservicesitem.controllers;

import com.example.microservicesitem.daos.ProductDao;
import com.example.microservicesitem.daos.ProductRestFeign;
import com.example.microservicesitem.entities.Item;
import com.example.microservicesitem.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class ItemController {

    final ProductDao productDao;
    final ProductRestFeign productRestFeign;

    public ItemController(ProductDao productDao, ProductRestFeign productRestFeign) {
        this.productDao = productDao;
        this.productRestFeign = productRestFeign;
    }

    @GetMapping("/items")
    public List<Item> list(){
        List<Item> items = new ArrayList<>();
        for (Product product: productRestFeign.list()){
            Item item = new Item();
            Random random = new Random();
            long amount = random.nextInt(100);

            item.setProduct(product);
            item.setAmount(amount);
            items.add(item);
        }

        return items;
    }
}
