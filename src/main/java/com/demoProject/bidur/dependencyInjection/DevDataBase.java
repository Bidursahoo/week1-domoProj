package com.demoProject.bidur.dependencyInjection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "database.env" , havingValue = "dev")
public class DevDataBase implements DB{
    @Override
    public String getData() {
        return "this is from development database";
    }
}
