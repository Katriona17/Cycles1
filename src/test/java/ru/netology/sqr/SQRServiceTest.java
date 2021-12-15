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

        int actual = sqrService.calculate (startlimit, endlimit, counter);

        assertEquals(expected, actual);

    }
}