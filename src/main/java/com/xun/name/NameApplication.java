package com.xun.name;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.xun.name.dao")
@EnableCaching
public class NameApplication {

    public static void main(String[] args) {
        SpringApplication.run(NameApplication.class, args);
    }

}
