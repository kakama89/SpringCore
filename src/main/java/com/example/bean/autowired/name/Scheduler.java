package com.example.bean.autowired.name;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Scheduler {
    @Resource(name = "cronJob")
    private Job job;
}
