package kz.zhelezyaka.didemo.controllers;

import kz.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello Spring!");
        return greetingService.sayGreeting();
    }
}
