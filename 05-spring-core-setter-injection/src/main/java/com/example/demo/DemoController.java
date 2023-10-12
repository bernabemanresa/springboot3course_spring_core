package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    private Player myPlayer;

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);


    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }


    @Autowired
    public void initCoach(Coach theCoach){
        myCoach = theCoach;
    }

    @Autowired(required = false)
    public void setPlayer(Player thePlayer){
        if (thePlayer == null) {
            // default logic
            logger.error("thePlayer is null, initialization failed.");
            return; // No initialice myPlayer if thePlayer is null
        }
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
