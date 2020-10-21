package kz.zhelezyaka.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"ru", "default"})
public class PrimaryRussianGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Первичный русская локация greeting сервис";
    }
}

