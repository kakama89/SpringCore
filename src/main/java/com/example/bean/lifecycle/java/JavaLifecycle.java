package com.example.bean.lifecycle.java;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class JavaLifecycle implements InitializingBean, DisposableBean {
    public JavaLifecycle() {
        System.err.println("constructor JavaLifecycle");
    }

    @Override
    public void destroy() throws Exception {
        System.err.println("destroy JavaLifecycle");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("afterPropertiesSet JavaLifecycle");
    }
}
