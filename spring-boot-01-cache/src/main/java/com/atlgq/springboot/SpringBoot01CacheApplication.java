package com.atlgq.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 一、基本环境准备
 * 1、创建数据库spring_cache，创建两张表Department和Employee
 * 2、创建javaBean的封装
 * 3、整合Mybatis的操作数据库
 *      1、配置数据源
 *      2、使用注解版的mapper
 * 二、快速体验缓存
 * 步骤：
 *      1、开启基于注解的缓存
 *      2、标注缓存注解即可
 */


@MapperScan(value = "com.atlgq.springboot.mapper")
@SpringBootApplication
public class SpringBoot01CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01CacheApplication.class, args);
    }

}
