package com.example.bean.multiple.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class HtmlExporter implements Exporter {
    @Override
    public void export() {
        System.out.println("export html");
    }
}
