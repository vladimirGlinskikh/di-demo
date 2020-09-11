package kz.zhelezyaka.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello() {
        System.out.println("Hello Spring!");
        return "foo";
    }
}
