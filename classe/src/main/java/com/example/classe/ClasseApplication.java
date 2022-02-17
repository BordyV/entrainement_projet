package com.example.classe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ClasseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClasseApplication.class, args);
    }

}
