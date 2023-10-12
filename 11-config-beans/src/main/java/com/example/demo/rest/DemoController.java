package com.example.demo.rest;

import com.example.demo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    private Coach coach2;

    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach coach, @Qualifier("customNamedCoach") Coach coach2) {
        System.out.println("In the constructor: " + getClass().getSimpleName());
        this.coach = coach;
        this.coach2 = coach2;
    }
    @GetMapping("/")
    public String getDailyWorkout(){
        return "Coach1: " + coach.getDailyWorkout() + " and Coach2: " + coach2.getDailyWorkout();
    }
}
