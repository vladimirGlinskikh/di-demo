package kz.zhelezyaka.didemo.controllers;

import kz.zhelezyaka.didemo.services.GreetingService;
import kz.zhelezyaka.didemo.services.GreetingServiceImpl;

public class GetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
