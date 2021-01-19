package kz.zhelezyaka.didemo.config;

import kz.zhelezyaka.didemo.examplebeans.FakeDataSource;
import kz.zhelezyaka.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${kz.username}")
    String user;

    @Value("${kz.password}")
    String password;

    @Value("${kz.dburl}")
    String url;

    @Value("${kz.jms.username}")
    String jmsUsername;

    @Value("${kz.jms.password}")
    String jmsPassoword;

    @Value("${kz.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(jmsUsername);
        jmsBroker.setPassword(jmsPassoword);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }
}
