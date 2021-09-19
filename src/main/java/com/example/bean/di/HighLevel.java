package com.example.bean.di;

import org.springframework.stereotype.Component;

@Component
public class HighLevel {
    private Exporter export;

    public HighLevel(Exporter export) {
        this.export = export;
    }

}
