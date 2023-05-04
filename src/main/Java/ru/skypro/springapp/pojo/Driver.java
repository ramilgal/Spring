package ru.skypro.springapp.pojo;

public class Driver {
    private String name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public void StartTransport() {
        System.out.println(transport + " готов к работе под управлением водителя: " + name);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}
