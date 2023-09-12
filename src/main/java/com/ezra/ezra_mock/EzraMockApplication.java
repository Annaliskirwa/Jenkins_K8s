package com.ezra.ezra_mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EzraMockApplication {

    public static void main(String[] args) {
        SpringApplication.run(EzraMockApplication.class, args);
    }

}
