package com.mah312.springinaction.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        System.out.println("Hi Homa");
        return "home";
    }

    @GetMapping("/user")
    public String getUsers() {
        return "user";
    }
}
