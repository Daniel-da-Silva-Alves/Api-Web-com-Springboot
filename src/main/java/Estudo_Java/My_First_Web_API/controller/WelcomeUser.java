package Estudo_Java.My_First_Web_API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeUser {
    @GetMapping
    public String welcome(){
        return "Welcome to My Spring boot Web API";
    }
}
