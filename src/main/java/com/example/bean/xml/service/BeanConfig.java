package com.example.bean.xml.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean(name = "customerService2")
    public CustomerService customerService() {
        return new CustomerService();
    }
}
