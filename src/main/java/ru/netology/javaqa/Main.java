package ru.netology.javaqa;

import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
            SQRService service = new SQRService();
        System.out.println(service.calc(100, 20000));
    }
}