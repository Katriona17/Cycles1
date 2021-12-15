package ru.netology.sqr;



public class CounterService {
    public static void main(String[] args) {
        SQRService service = new SQRService ();
        int startlimit = 100;
        int endlimit = 400;
        int counter = 0;
        int result = service.calculate (startlimit, endlimit, counter);
        System.out.println(result);
    }
}
