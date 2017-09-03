package com.antonionoca.spring2sampleapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PublicationController extends AbstractController {

    private static final Logger log = LoggerFactory.getLogger(PublicationController.class);

    public ModelAndView handleRequestInternal(
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        log.info(request.getServletPath());

        return new ModelAndView("publications", "data", null);
    }
}