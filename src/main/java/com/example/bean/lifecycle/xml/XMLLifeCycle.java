package com.example.bean.lifecycle.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XMLLifeCycle {
    private static Logger logger = LoggerFactory.getLogger(XMLLifeCycle.class);
    public XMLLifeCycle() {

        System.err.println("construct XMLLifeCycle");
    }

    public void init() {
        logger.info("init XMLLifeCycle---------------------------");
        System.err.println("init XMLLifeCycle");
    }

    public void destroy() {
        System.err.println("destroy XMLLifeCycle");
    }
}
