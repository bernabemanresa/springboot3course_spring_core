package com.example.demo.rest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Value("${messages.welcome}")
    private String message;

    @GetMapping
    public String hello() {
        return "Hello world " + message;
    }
}



