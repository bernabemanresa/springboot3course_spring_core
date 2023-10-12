package com.example.demo;

// Not using @Component annotation!
public class FootballCoach implements Coach{


    public FootballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run 500 meters";
    }
}
