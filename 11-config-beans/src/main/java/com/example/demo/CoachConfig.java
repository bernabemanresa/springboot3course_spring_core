package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {

    @Bean
    public SwimCoach swimCoach(){
        return new SwimCoach();
    }


    @Bean("customNamedCoach")
    public FootballCoach fotballCoach(){
        return new FootballCoach();
    }
}
