package com.devin.spring.cloud.alibaba.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BusinessTransactionApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessTransactionApplication.class, args);
    }
}
