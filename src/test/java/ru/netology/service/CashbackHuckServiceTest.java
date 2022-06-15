package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHuckServiceTest {

    @Test
    public void testRemain() {
        CashbackHuckService service = new CashbackHuckService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainOver1000() {
        CashbackHuckService service = new CashbackHuckService();

        int expected = 200;
        int actual = service.remain(1800);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIf0() {
        CashbackHuckService service = new CashbackHuckService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIf1000() {
        CashbackHuckService service = new CashbackHuckService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }
}