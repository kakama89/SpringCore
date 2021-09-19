package com.example.bean.promatic;

import lombok.Getter;

@Getter
public class BeanDefinitionBean {
    private String value;

    public BeanDefinitionBean(String value) {
        this.value = value;
    }


    public void postConstruct(){
        System.err.println("BeanDefinitionBean post construct");
    }


}
