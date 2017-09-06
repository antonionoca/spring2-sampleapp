package com.antonionoca.spring2sampleapp.persistence.model;

public class Publication {

    private String text;

    public Publication(String text) {
        this.text = text;
    }

    private String getText() {
        return this.text;
    }
}
