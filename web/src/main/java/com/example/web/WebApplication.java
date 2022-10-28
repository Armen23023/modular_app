package com.example.web;

import com.example.core.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.core"})
public class WebApplication {
    UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
