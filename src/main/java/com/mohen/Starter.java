package com.mohen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用@MapperScan 指定接口所在的包
 */
@SpringBootApplication
@SuppressWarnings("all")
@MapperScan("com.mohen.crm.dao")
public class Starter {

    public static void main(String[] args) {

        SpringApplication.run(Starter.class);
    }
}