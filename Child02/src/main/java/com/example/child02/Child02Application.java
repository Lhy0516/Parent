package com.example.child02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Child02Application {

    public static void main(String[] args) {
        System.out.println("改动代码");
        SpringApplication.run(Child02Application.class, args);
    }

}
