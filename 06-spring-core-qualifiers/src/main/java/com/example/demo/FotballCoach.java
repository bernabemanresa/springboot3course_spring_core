package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FotballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 30 minutes";
    }
}
