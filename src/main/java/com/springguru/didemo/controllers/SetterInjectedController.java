package com.springguru.didemo.controllers;

import com.springguru.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    // Setter Injection
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;

    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}