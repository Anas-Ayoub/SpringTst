package com.example.test.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainConroller {
    @GetMapping("/")
    public String test() {
        return "Hello Ramadan!!";
    }

}
