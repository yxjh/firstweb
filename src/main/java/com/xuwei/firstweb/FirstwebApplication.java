package com.xuwei.firstweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FirstwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstwebApplication.class, args);
    }

}
