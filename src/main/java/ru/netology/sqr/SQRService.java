package ru.netology.sqr;

public class SQRService {

    public int calculate(int startLimit, int endLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= startLimit & i * i <= endLimit) {
                counter++;
            }
        }
        return counter;
    }
}
