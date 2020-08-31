package com.example.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SyncAPI {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from producer!";
    }
}
