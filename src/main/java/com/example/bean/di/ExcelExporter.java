package com.example.bean.di;

public class ExcelExporter implements Exporter{
    @Override
    public void export() {
        System.out.println("Excel exporter");
    }
}
