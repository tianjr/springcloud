package com.tjr.springcloudserver8084;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan("com.tjr")
public class Springcloudserver8084Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloudserver8084Application.class, args);
    }

}
