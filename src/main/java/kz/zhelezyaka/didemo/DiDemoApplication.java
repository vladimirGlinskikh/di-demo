package kz.zhelezyaka.didemo;

import kz.zhelezyaka.didemo.controllers.ConstructorInjectedController;
import kz.zhelezyaka.didemo.controllers.GetterInjectedController;
import kz.zhelezyaka.didemo.controllers.MyController;
import kz.zhelezyaka.didemo.controllers.PropertyInjectedController;
import kz.zhelezyaka.didemo.examplebeans.FakeDataSource;
import kz.zhelezyaka.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"kz.zhelezyaka.didemo.services", "kz.zhelezyaka.didemo"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        //MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUsername());
    }
}
