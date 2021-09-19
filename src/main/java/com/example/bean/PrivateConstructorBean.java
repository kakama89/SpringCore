package com.example.bean;


import org.springframework.stereotype.Component;

@Component
public class PrivateConstructorBean {
    private PrivateConstructorBean() {
        // will allow
    }
}
