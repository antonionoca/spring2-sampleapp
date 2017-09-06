package com.antonionoca.spring2sampleapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class PublicationController extends AbstractController {

    private static final Logger log = LoggerFactory.getLogger(PublicationController.class);

    public ModelAndView handleRequestInternal(
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        if (!request.getMethod().equals("GET")) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.getWriter().close();
            return null;
        }

        log.info(request.getServletPath());

        List<String> publications = new ArrayList<String>();
        publications.add("Msg 1");
        publications.add("Msg 2");

        return new ModelAndView("publications", "publications", publications);
    }
}