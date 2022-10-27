package com.example.rest;

import com.example.core.TTT;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {

    public static void main(String[] args) {
        TTT t =  new TTT();
        SpringApplication.run(RestApplication.class, args);
    }

}
