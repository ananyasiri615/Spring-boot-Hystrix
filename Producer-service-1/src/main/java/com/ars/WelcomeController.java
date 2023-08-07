package com.ars;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
 
    @RequestMapping("/greeting")
    public String greeting(@PathVariable("username") String username) throws Exception {
    	if(username.equalsIgnoreCase("abc")){
    		throw new Exception();
    	}
        return "Hello, " + username;
    }
}