package com.example.demo2;

import com.example.demo.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketPlayer implements Player {

    @Override
    public String doWorkout() {
        return "Working very hard";
    }
}
