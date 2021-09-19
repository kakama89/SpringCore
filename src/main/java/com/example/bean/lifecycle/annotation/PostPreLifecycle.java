package com.example.bean.lifecycle.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PostPreLifecycle {
    public PostPreLifecycle() {
        System.err.println("constructor PostPreLifecycle");
    }

    @PostConstruct
    public void postConstruct() {
        System.err.println("postConstruct PostPreLifecycle");
    }

    @PreDestroy
    public void preDestroy() {
        System.err.println("preDestroy PostPreLifecycle");
    }

}
