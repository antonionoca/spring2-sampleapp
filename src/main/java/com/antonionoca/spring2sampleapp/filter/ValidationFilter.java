package com.antonionoca.spring2sampleapp.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ValidationFilter implements javax.servlet.Filter {

    private static final Logger log = LoggerFactory.getLogger(ValidationFilter.class);

    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("ValidationFilter.init");
    }

    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        chain.doFilter(new ValidatingHttpRequest( (HttpServletRequest)request ), response);
    }

    public void destroy() {
        log.info("ValidationFilter.destroy");
    }
}
