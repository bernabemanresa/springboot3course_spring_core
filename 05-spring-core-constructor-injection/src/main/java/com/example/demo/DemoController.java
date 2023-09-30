package com.example.demo;

import com.example.demo2.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    private Player myPlayer;

    //Constructor Injection
    @Autowired
    public DemoController(Coach theCoach, Player thePlayer){
        myCoach = theCoach;
        myPlayer = thePlayer;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/train")
    public String getTrain(){
        return myPlayer.doWorkout();
    }
}
