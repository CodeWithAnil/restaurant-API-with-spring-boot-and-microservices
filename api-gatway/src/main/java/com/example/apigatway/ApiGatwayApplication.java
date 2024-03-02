package com.example.apigatway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication
@EnableDiscoveryClient

public class ApiGatwayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatwayApplication.class, args);
    }
}
