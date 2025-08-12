package com.demoProject.bidur.demoProject;

import org.springframework.stereotype.Component;
@Component
//auto configured bean
public class Apple {
    void getApples(){
        System.out.println("We are getting apples from autoconfigured bean");
    }

}
