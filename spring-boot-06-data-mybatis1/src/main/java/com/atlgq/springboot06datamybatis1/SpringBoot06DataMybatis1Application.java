package com.atlgq.springboot06datamybatis1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.atlgq.springboot06datamybatis1.mapper")
@SpringBootApplication
public class SpringBoot06DataMybatis1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot06DataMybatis1Application.class, args);
    }

}
