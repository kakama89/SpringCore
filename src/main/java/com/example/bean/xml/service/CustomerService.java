package com.example.bean.xml.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.UUID;

public class CustomerService {
    public CustomerService() {
        System.err.println("construct customer service");
    }

    private UUID hash;

    public String getHash() {
        if (hash == null) {
            this.hash = UUID.randomUUID();
        }
        return hash.toString();
    }

    private void init() {
        System.out.println("xml init " + getHash());
    }

    private void destroy() {
        System.out.println("xml destroy  " + getHash());
    }

    @PostConstruct
    public void javaInit() {
        System.out.println("java init " + getHash());
    }

    @PreDestroy
    public void javaDestroy() {
        System.out.println("javaDestroy ");
    }
}
