package com.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@ResponseBody
public class ConsumeController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/helloservice")
    public String helloClient(){
        return restTemplate.getForEntity("http://hello-service/hello",String.class).getBody();
    }
}
