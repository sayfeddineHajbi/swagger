package com.example.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello , World";}
}
