package com.tjr.springcloudserver8083;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@ComponentScan("com.tjr")
public class Springcloudserver8083Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloudserver8083Application.class, args);
    }

}
