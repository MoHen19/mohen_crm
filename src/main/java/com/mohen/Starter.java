package com.mohen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 使用@MapperScan 指定接口所在的包
 * @author MH19
 */
@SpringBootApplication
@MapperScan("com.mohen.crm.dao")
// @EnableScheduling
public class Starter {

    public static void main(String[] args) {

        SpringApplication.run(Starter.class);
    }
}