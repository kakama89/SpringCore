package com.example.bean.autowired.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Application {

    @Autowired
    private Connection connection;

}
