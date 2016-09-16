package com.tano.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/controller", method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!\n";
    }
}
