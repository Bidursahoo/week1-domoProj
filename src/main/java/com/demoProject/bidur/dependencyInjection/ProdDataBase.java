package com.demoProject.bidur.dependencyInjection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "database.env" , havingValue = "prod")
public class ProdDataBase implements DB{

    @Override
    public String getData() {
        return "this is from production database";
    }
}
