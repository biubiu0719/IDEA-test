package com.biubiu.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.biubiu.demo.dao")
@SpringBootApplication
public class BiubiuApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiubiuApplication.class, args);
    }

}
