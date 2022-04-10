package com.amit.test.springrestservicetest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping
    public String show() {
        return "Hello from Test Service and Azure";
    }
}
