package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);

        System.out.println(actual);
    }

}
