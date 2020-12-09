package com.atlgq.springboot.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //使用日志
    Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/hello")
    public String hello() {

        logger.trace("我是trace------------");
        logger.debug("我是debug信息----------------------------------");
        //默认情况下只打印info级别以上的日志信息
        logger.info("我是logger的信息---------------");
        logger.warn("我是warn------------------");
        logger.error("这是error----------------------");
        return serverPort + "\thello world quick";
    }
}
