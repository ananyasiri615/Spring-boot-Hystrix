package com.ars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ars.service.GreetingService;

@RestController
public class GreetingController {
 
    @Autowired
    private GreetingService greetingService;
 
    @GetMapping("/get-greeting/{username}")
    public String getGreeting(@PathVariable("username") String username) {
        String msg = greetingService.getGreeting(username);
        return msg;
    }
}