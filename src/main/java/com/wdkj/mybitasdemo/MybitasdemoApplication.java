package com.wdkj.mybitasdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@MapperScan("com.wdkj.mybitasdemo.mapper")
@EnableWebMvc
@SpringBootApplication
public class MybitasdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybitasdemoApplication.class, args);
    }

}
