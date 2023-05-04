package ru.skypro.springapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.skypro.springapp.pojo.Bus;
import ru.skypro.springapp.pojo.Car;
import ru.skypro.springapp.pojo.Driver;
import ru.skypro.springapp.pojo.Pickup;

@Configuration
public class AppConfig {
    @Bean(name = "car")
    public Car getCarBean() {
        return new Car("Lada", "Kalina");
    }
    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus("Kamaz", "Red");
    }
    @Bean(name = "pickup")
    public Pickup getPickupBean() {
        return new Pickup("Toyota", "L200");
    }
    @Bean(name = "driver1")
    public Driver getDriver1Bean() {
        return new Driver("Ivan", getCarBean());
    }
    @Bean(name = "driver2")
    public Driver getDriver2Bean() {
        return new Driver("Petya", getBusBean());
    }
    @Bean(name = "driver3")
    public Driver getDriver3Bean() {
        return new Driver("Nikita", getPickupBean());
    }
}
