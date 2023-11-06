package com.mah312.springinaction.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Users {

    @GetMapping("/users/getuser")
    public String  getUsers() {
        return "Hi everyone...";
    }
}
