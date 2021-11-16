package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// this is a Rest Controller
@RestController
public class EmployeeResponseController {

    @Autowired
    ServiceResponse serviceResponse;

    @RequestMapping(value = "/response", method = RequestMethod.GET)
    public String getResponse() {
        return serviceResponse.callResponse();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getResponseTest() {
        return "test";
    }



}



