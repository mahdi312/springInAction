package com.mah312.springinaction.home;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getHome() {
        return "home";
    }
}
