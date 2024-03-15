package com.example.oftmarts.shop.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductController {
    @GetMapping("/")
    public String getMethodName(@RequestParam String param) {
        return new String("<h1>Welcome Home</h1>");
    }
    
}
