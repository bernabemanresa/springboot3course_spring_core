package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    private Coach myCoach2;
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    public DemoController(@Autowired  Coach theCoach, @Autowired  Coach theCoach2) {
        logger.info("DemoController init");
        this.myCoach = theCoach;
        this.myCoach2 = theCoach2;
        logger.info("myCoach == myCoach2: " + (myCoach == myCoach2));
    }

    @GetMapping("/")
    public String getDailyWork(){
       return  myCoach.getDailyWorkout();
    }

}
