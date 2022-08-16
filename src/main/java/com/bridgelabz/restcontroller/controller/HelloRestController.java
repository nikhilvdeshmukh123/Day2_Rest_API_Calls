package com.bridgelabz.restcontroller.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping(value = {"", "/", "/home"})
    public String Hello(){
        return "Hello from Bridgelabz";
    }

    @GetMapping(value = {"/query"})
    public String sayHello(@RequestParam String name){
        return " Hello " + name + "!";
    }

}