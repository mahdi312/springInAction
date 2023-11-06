package com.mah312.springinaction.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/user")
    public String getUsers() {
        return "user";
    }
}
