package com.example.bean.autowired.type;

import org.springframework.stereotype.Component;

@Component
public class MysqlConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connect....");
    }
}
