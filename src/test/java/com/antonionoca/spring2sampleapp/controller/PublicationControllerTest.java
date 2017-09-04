package com.antonionoca.spring2sampleapp.controller;

import junit.framework.TestCase;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.HttpRequestMethodNotSupportedException;
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

    public void testPostRequest() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setMethod("POST");
        request.setRequestURI("http://localhost:8080/publications.htm");
        HttpServletResponse response = new MockHttpServletResponse();

        controller.handleRequest(request, response);
        assertEquals("Response should be 404", HttpServletResponse.SC_NOT_FOUND, ((MockHttpServletResponse) response).getStatus());
    }

    public void testPutRequest() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setMethod("PUT");
        request.setRequestURI("http://localhost:8080/publications.htm");
        HttpServletResponse response = new MockHttpServletResponse();

        try {
            controller.handleRequest(request, response);
            fail("Expected exception");
        } catch (HttpRequestMethodNotSupportedException exception) {
            assertEquals(exception.getMessage(), "Request method 'PUT' not supported");
        }
    }

    public void testPatchRequest() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setMethod("PATCH");
        request.setRequestURI("http://localhost:8080/publications.htm");
        HttpServletResponse response = new MockHttpServletResponse();

        try {
            controller.handleRequest(request, response);
            fail("Expected exception");
        } catch (HttpRequestMethodNotSupportedException exception) {
            assertEquals(exception.getMessage(), "Request method 'PATCH' not supported");
        }
    }

    public void testDeleteRequest() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setMethod("DELETE");
        request.setRequestURI("http://localhost:8080/publications.htm");
        HttpServletResponse response = new MockHttpServletResponse();

        try {
            controller.handleRequest(request, response);
            fail("Expected exception");
        } catch (HttpRequestMethodNotSupportedException exception) {
            assertEquals(exception.getMessage(), "Request method 'DELETE' not supported");
        }
    }
}