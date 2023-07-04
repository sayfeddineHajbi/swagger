package com.example.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/sayHello")
    public String Message(){
        return "Hello , World";}
    @PostMapping("/add")
    public String Message(@RequestBody String message) {
        return "Message créé avec succès : " + message;

    }
}
