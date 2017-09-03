package com.antonionoca.spring2sampleapp.controller;

import junit.framework.TestCase;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class PublicationControllerTest extends TestCase {

    private PublicationController controller;

    @Override
    protected void setUp() {
        this.controller = new PublicationController();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetRequest() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setMethod("GET");
        request.setRequestURI("http://localhost:8080/publications.htm");
        HttpServletResponse response = new MockHttpServletResponse();

        ModelAndView modelAndView = controller.handleRequest(request, response);
        assertNotNull("ModelAndView should not be null", modelAndView);
        assertEquals("View name should be 'publications'", "publications",
                modelAndView.getViewName());

        Map model = modelAndView.getModel();
        assertTrue("Model should be 'data'", model.containsKey("data"));
        Object data = model.get("data");
        assertNull("Model element 'data' should be null", data);
    }
}