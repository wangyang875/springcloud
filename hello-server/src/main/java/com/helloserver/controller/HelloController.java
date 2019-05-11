package com.helloserver.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
@ResponseBody
public class HelloController {
    @Value("${server.port}")
    String port;
    @GetMapping("/hello")
    public String index(){
        return "hi,i am from port:" + port;
    }
}
