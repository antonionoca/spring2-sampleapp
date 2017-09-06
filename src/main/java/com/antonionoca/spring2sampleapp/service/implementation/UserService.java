package com.antonionoca.spring2sampleapp.service.implementation;

import com.antonionoca.spring2sampleapp.persistence.model.User;
import com.antonionoca.spring2sampleapp.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {

    public List<User> getUsers() {

        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");

        List<User> users = new ArrayList<User>();
        users.add((User)context.getBean("jack"));
        users.add((User)context.getBean("john"));

        return users;
    }
}
