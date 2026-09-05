package com.abdullah0s.coffeebrewingcalculator.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@RestController
public class HelloRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello, World!";
    }

    // Testing boot dev tool 'new endpoint while it was running'
    @GetMapping("/time")
    public String WhatTime() {
        return LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS).toString();
    }

}
