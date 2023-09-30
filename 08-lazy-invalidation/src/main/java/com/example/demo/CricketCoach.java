package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach{
    private static final Logger logger = LoggerFactory.getLogger(CricketCoach.class);

    public CricketCoach() {
        logger.info("CricketCoach starts");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
