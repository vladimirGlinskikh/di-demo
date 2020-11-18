package kz.zhelezyaka.didemo.services;

public class PrimaryRussianGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimaryRussianGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getRussianGreeting();
    }
}

