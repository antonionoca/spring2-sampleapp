package com.antonionoca.spring2sampleapp.service.implementation;

import com.antonionoca.spring2sampleapp.service.IUserService;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {

    public List<String> getUsers() {
        List<String> users = new ArrayList<String>();
        users.add("Joe");
        users.add("John");

        return users;
    }
}
