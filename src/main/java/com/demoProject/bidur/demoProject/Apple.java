package com.demoProject.bidur.demoProject;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
@Component
//auto configured bean
public class Apple {
    void getApples(){
        System.out.println("We are getting apples from autoconfigured bean");
    }

    @PostConstruct
    void runAfterConstruction(){
        System.out.println("This is from post Construction");
    }
    @PreDestroy
    void runBeforeDestruction(){
        System.out.println("This is from pre destroy");
    }

}
