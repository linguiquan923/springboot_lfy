package com.atlgq.springboot.controller;

import com.atlgq.atlgq.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hello")
    public String hello(){
        String atlgq = helloService.sayHello("atlgq");
        return atlgq;
    }

}
