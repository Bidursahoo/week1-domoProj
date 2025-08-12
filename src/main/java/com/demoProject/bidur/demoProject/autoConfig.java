package com.demoProject.bidur.demoProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class autoConfig {
    @Bean
    customApple getApple(){
        return new customApple();
    }
}
