package com.devin.spring.cloud.alibaba.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan(basePackages = "com.devin.spring.cloud.alibaba.provider.mapper")
public class ProviderOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderOrderApplication.class, args);
    }
}
