package com.example.microservicesitem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroservicesItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesItemApplication.class, args);
    }

}
