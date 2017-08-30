package com.antonionoca.spring2sampleapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App  {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("Starting application..");

        new FileSystemXmlApplicationContext("classpath:beans.xml");

        logger.info("Application Context loaded..");
    }
}
