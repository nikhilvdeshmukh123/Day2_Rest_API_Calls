package com.bridgelabz.restcontroller.controller;

import com.bridgelabz.restcontroller.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping(value = {"", "/", "/home"})
    public String Hello() {
        return "Hello from Bridgelabz";
    }

    @GetMapping(value = {"/query"})
    public String sayHello(@RequestParam String name) {
        return " Hello " + name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return " Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + "" + user.getLastName() + "!";
    }
}