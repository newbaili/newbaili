package com.newdx.baili;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.newdx.baili.dao")
public class BailiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BailiApplication.class, args);
    }

}
