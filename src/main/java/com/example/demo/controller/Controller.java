package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class Controller {
    
    
    @GetMapping("/{name}")
    public String helloname(@PathVariable(name="name")String user) {
        return "Hello "+user ;
    }
}
