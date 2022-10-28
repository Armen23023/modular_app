package com.example.rest;

import com.example.core.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {
    UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

}
