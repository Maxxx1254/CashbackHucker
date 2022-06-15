package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHuckServiceTest {

    @Test
    public void testRemain() {
        CashbackHuckService service = new CashbackHuckService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);
    }
}