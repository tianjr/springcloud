package com.tjr.springcloudserver8083;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String Port;

    @RequestMapping("/test")
    public String test(){
        return "server被调用了！："+Port;
    }
}
