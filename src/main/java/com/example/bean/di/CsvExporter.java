package com.example.bean.di;

import org.springframework.stereotype.Component;

@Component
public class CsvExporter implements Exporter {
    public CsvExporter(){
        // db.connect();
    }
    @Override
    public void export() {
        System.out.println("Export csv");

    }
}
