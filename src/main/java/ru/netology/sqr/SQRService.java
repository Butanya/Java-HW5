package ru.netology.sqr;

public class SQRService {


    public int calculate(int first, int second) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= first && x <= second) {
                count++;
            }
        }
        return count;
    }
}
