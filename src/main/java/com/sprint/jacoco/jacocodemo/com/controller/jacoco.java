package com.sprint.jacoco.jacocodemo.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jacoco {
    @RequestMapping("/")
    public String hello() {
        return "Hello Word";
    }

    @RequestMapping("/index")
    public String login() {
        return "欢迎来到登录首页！";
    }


    @RequestMapping("/b")
    public String contrastB() {
        int a = 5;
        int b = 5;
        if (a > b) {
            return "a<b";
        } else {
            return "b>a";
        }
    }

    @RequestMapping("/a")
    public String contrastA() {
        int a = 5;
        int b = 1;
        if (a > b) {
            return "a>b";
        } else {
            return "b>a";
        }
    }
}