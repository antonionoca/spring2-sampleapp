package com.antonionoca.spring2sampleapp.controller;

import junit.framework.TestCase;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class UserControllerTest extends TestCase {

    private UserController controller;

    public UserControllerTest() {

    }

    @Override
    protected void setUp() {
        this.controller = new UserController();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetRequest() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setMethod("GET");
        request.setRequestURI("http://localhost:8080/users.htm");
        HttpServletResponse response = new MockHttpServletResponse();

        ModelAndView modelAndView = controller.handleRequest(request, response);
        assertNotNull("ModelAndView should not be null", modelAndView);
        assertEquals("View name should be 'users'", "users",
                modelAndView.getViewName());
        Map model = modelAndView.getModel();
        assertTrue("Model should contain 'user' key", model.containsKey("users"));
        List users = (List) model.get("users");
        assertNotNull("Model element 'users' should not be null", users);
        assertEquals("Model element 'users' should contain 1 item", 1, users.size());
    }
}
