package com.example.bean.xml;

import com.example.bean.xml.service.ClientService;

public class ServiceLocatorFactoryBean {
    private static ClientService clientService = new ClientService();

    public ClientService createClientServiceInstance() {
        return clientService;
    }
}
