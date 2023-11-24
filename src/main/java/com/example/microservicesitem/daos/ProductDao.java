package com.example.microservicesitem.daos;

import com.example.microservicesitem.entities.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductDao {
    private String url = "http://localhost:8001/products";
    public List<Product> list(){
        RestTemplate restTemplate = new RestTemplate();
        Product[] productsArray = restTemplate.getForObject(url, Product[].class);
        return Arrays.asList(productsArray);
    }
}
