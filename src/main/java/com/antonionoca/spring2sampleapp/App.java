package com.antonionoca.spring2sampleapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App  {

    public static void main(String[] args) {

        System.out.println("Starting application..");

        new FileSystemXmlApplicationContext("classpath:beans.xml");

        System.out.println("Application Context loaded..");
    }
}
