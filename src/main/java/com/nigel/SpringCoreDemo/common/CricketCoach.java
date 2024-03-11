package com.nigel.SpringCoreDemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    /*
    // define our init method
    @PostConstruct
    public void runStartupProcedure(){
        System.out.println("In runStartupProcedure(): " + getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void runCleanupProcedure(){
        System.out.println("In runCleanupProcedure(): " + getClass().getSimpleName());
    }
    */

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
