package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void calculateBonus()

    {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual= service.remain(1000);
        assertEquals(expected,actual);
    }
    @Test
    void calculateBonusFail()

    {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual= service.remain(1000);
        assertEquals(expected,actual);
    }

}