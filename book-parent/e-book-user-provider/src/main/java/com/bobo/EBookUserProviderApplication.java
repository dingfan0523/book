package com.bobo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EBookUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EBookUserProviderApplication.class, args);
    }

}
