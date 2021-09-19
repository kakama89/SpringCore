package com.example.bean.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaCodeBeanConfig {
    @Bean
    public JavaConfigBean javaBean() {
        return new JavaConfigBean();
    }
}
