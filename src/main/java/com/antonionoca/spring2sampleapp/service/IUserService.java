package com.antonionoca.spring2sampleapp.service;

import com.antonionoca.spring2sampleapp.persistence.model.User;

import java.util.List;

public interface IUserService {

    List<User> getUsers();
}
