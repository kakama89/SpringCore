package com.example.bean;

import org.springframework.stereotype.Component;

//@Component
public class NoConstructorBean {
    public NoConstructorBean(int a) {
        // cannot create bean
    }
}
