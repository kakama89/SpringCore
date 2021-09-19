package com.example.bean.multiple.impl;

import org.springframework.stereotype.Component;

@Component
public class ExcelExporter implements Exporter {
    @Override
    public void export() {
        System.out.println("export xlsx");
    }
}
