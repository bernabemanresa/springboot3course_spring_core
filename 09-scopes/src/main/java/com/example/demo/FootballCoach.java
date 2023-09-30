package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
