package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimaryDemoController {
    private Coach myCoach;

    private static final Logger logger = LoggerFactory.getLogger(PrimaryDemoController.class);

    @Autowired
    public PrimaryDemoController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/footballDailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


}
