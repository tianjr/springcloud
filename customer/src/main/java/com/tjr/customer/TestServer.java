package com.tjr.customer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "springcloud-server")
public interface TestServer {

    @RequestMapping("/test")
    public String test();
}
