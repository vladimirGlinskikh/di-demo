package kz.zhelezyaka.didemo.controllers;

import kz.zhelezyaka.didemo.services.GreetingServiceImpl;


public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
