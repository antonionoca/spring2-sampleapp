package com.antonionoca.spring2sampleapp.persistence.model;

import java.util.List;

public class User {

    private String name;
    private List<Publication> publications;

    public User(String name, List<Publication> publications) {
        this.name = name;
        this.publications = publications;
    }

    public String getName() {
        return name;
    }

    public List<Publication> getPublications() {
        return publications;
    }
}
