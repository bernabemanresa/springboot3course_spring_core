package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Client {

    public Client() {
        System.out.println("Client Constructor");
    }

    @PostConstruct
    public void doStartupStuff(){
        System.out.println("Startup works ................");
    }

    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("Clean works.......");
    }
}
