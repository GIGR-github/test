package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginController {
    @GetMapping("/login")
    void login() {
        String nume = null;
        System.out.println(nume.startsWith("sdf"));
        System.out.println("login");

    }
}
