package com.example.microservicesitem.daos;

import com.example.microservicesitem.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "microservice-product", url = "localhost:8001")
public interface ProductRestFeign {

    @GetMapping("/products")
    List<Product> list();
}
