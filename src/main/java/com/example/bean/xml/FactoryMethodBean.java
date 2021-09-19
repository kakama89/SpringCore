package com.example.bean.xml;

import com.example.bean.xml.service.CustomerService;


public class FactoryMethodBean {
    private FactoryMethodBean() {

    }

    public static CustomerService createCustomerService() {
        return new CustomerService();
    }
}

