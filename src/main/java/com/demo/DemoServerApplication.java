package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoServerApplication {

    public static void main(String[] args) {
        System.out.println("项目启动成功");
        SpringApplication.run(DemoServerApplication.class, args);
    }
}
