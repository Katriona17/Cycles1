package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void shouldCounterTill200() {
        SQRService sqrService = new SQRService();
        int startLimit = 100;
        int endLimit = 200;
        int expected = 5;

        int actual = sqrService.calculate(startLimit, endLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSquareRootOnlyOne() {
        SQRService sqrService = new SQRService();
        int startLimit = 100;
        int endLimit = 100;
        int expected = 1;

        int actual = sqrService.calculate(startLimit, endLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSquareRootZero() {
        SQRService sqrService = new SQRService();
        int startLimit = 10;
        int endLimit = 20;
        int expected = 0;

        int actual = sqrService.calculate(startLimit, endLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSquareRootForUpBorder() {
        SQRService sqrService = new SQRService();
        int startLimit = 9801;
        int endLimit = 9801;
        int expected = 1;

        int actual = sqrService.calculate(startLimit, endLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSquareRootForDifferentBorders() {
        SQRService sqrService = new SQRService();
        int startLimit = 100;
        int endLimit = 9801;
        int expected = 90;

        int actual = sqrService.calculate(startLimit, endLimit);

        assertEquals(expected, actual);
    }
}