package com.tjr.springcloudserver8082;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@ComponentScan("com.tjr")
public class Springcloudserver8082Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloudserver8082Application.class, args);
    }

}
