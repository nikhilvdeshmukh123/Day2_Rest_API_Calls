package com.bridgelabz.restcontroller.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping(value = {"", "/", "/home"})
    public String Hello(){
        return "Hello from Bridgelabz";
    }

}
