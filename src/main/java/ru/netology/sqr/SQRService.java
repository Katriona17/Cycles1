package ru.netology.sqr;

public class SQRService {

    public int calculate(int startlimit, int endlimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= startlimit & i * i <= endlimit) {
                counter++;
            }
        }
        return counter;
    }
}
