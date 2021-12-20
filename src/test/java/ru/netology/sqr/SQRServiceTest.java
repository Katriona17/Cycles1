package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test

    void shouldCounterTill200 () {
        SQRService sqrService = new SQRService ();
        int startlimit = 100;
        int endlimit = 200;
        int expected = 5;

        int actual = sqrService.calculate (startlimit, endlimit);

        assertEquals(expected, actual);

    }
    @Test
    void shouldSquareRootOnlyOne () {
        SQRService sqrService = new SQRService ();
        int startlimit = 100;
        int endlimit = 100;
        int expected = 1;

        int actual = sqrService.calculate (startlimit, endlimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSquareRootZero () {
        SQRService sqrService  = new SQRService ();
        int startlimit = 10;
        int endlimit = 20;
        int expected = 0;

        int actual = sqrService.calculate (startlimit, endlimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateIfUnderBorder () {
        SQRService sqrService = new SQRService ();
        int i < 10;
        int startlimit = 100;
        int endlimit = 200;
        int expected = 0;

        int actual = sqrService.calculate (startlimit, endlimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateIfOverBorder () {
        SQRService sqrService = new SQRService ();
        int i > 99;
        int startlimit = 100;
        int endlimit = 200;
        int expected = 0;

        int actual = sqrService.calculate (startlimit, endlimit);

        assertEquals(expected, actual);
    }
}