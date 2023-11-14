package com.example.introductionspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
    @GetMapping("/name")
    public String myName(){
        return "My name is Areej";
    }
    @GetMapping("/age")
    public String myAge(){
        return "My age is 21";
    }
    @GetMapping("/check/status")
    public String check(){
        return "Everything OK";
    }
    @GetMapping("/health")
    public String health(){
        return "server health is up and running";
    }
    @GetMapping("/names")
    public String []names(){
        String []namess={"Areej","Sarah","Norah"};
        return namess;
    }
}
