package com.demoProject.bidur.dependencyInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataBaseService {

    // Field Injection Version
//    @Autowired
//    private DB db;


    // Construction Injection Version

    final private DB db;
    public  DataBaseService(DB db){
        this.db = db;
    }

    String getData(){
        return db.getData();
    }

}
