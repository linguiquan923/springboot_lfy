package com.atlgq.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class HelloWorldController {

    @ResponseBody
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello spring";
    }

    @GetMapping(value = "/success")
    public String success(Map<String,Object> maps){
        maps.put("hello","你好啊Thymeleaf");

        //自动找到templates下面的success.html
        return "success";
    }



}
