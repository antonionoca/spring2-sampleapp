package com.antonionoca.spring2sampleapp.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class ValidatingHttpRequest extends HttpServletRequestWrapper {

    public ValidatingHttpRequest(HttpServletRequest request) {
        super(request);
    }
}
