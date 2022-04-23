package com.magd.springsecurityclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {


    @GetMapping("/hello")
    public String hi() {
        return "Hello, Welcome , Tudo bem?";
    }
}
