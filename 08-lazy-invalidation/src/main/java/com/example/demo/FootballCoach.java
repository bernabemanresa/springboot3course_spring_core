package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootballCoach implements Coach{
    private static final Logger logger = LoggerFactory.getLogger(FootballCoach.class);

    public FootballCoach() {
        logger.info("FootballCoach starts");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 30 minutes";
    }
}
