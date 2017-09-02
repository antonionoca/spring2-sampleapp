package com.antonionoca.spring2sampleapp.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

public class UserController extends AbstractController {

    public UserController() {

    }

    protected ModelAndView handleRequestInternal(
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        List<String> users = new ArrayList<String>();
        users.add("Joe");

        return new ModelAndView("users", "user", users);
    }
}
