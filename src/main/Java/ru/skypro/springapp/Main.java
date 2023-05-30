package ru.skypro.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.skypro.springapp.config.AppConfig;
import ru.skypro.springapp.pojo.Driver;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver1 = context.getBean("driver1", Driver.class);
        Driver driver2 = context.getBean("driver2", Driver.class);
        Driver driver3 = context.getBean("driver3", Driver.class);
        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);
        driver1.StartTransport();
        driver2.StartTransport();
        driver3.StartTransport();
    }
}
