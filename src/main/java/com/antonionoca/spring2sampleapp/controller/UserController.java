package com.antonionoca.spring2sampleapp.controller;

import com.antonionoca.spring2sampleapp.service.IUserService;
import com.antonionoca.spring2sampleapp.service.implementation.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class UserController extends AbstractController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    public ModelAndView handleRequestInternal(
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        if (!request.getMethod().equals("GET")) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.getWriter().close();
            return null;
        }

        log.info(request.getServletPath());

        IUserService userService = new UserService();

        return new ModelAndView("users", "users", userService.getUsers());
    }
}
