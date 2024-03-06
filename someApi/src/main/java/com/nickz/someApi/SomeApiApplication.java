package com.nickz.someApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SomeApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SomeApiApplication.class, args);
    }
}
