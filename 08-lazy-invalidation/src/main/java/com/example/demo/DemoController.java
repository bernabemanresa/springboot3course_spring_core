package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    public DemoController(@Autowired  Coach myCoach) {
        logger.info("DemoController init");
        this.myCoach = myCoach;
    }

    @GetMapping("/")
    public String getDailyWork(){
       return  myCoach.getDailyWorkout();
    }

}
