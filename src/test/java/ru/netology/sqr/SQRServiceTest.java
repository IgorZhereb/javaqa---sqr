package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldCalcExact(){
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calc(300, 400);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcZero(){
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calc(0, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcOne() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calc(100, 120);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMaxAmountOfSquares() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calc(100, 9801);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcOutOfMaxAmountOfSquares() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calc(0, 10000);

        Assertions.assertEquals(expected, actual);
    }


}