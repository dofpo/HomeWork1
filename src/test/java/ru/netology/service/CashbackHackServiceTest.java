package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service= new CashbackHackService();
        int actual= service.remain(1000);
        int expected=1000;
        assertArrayEquals(expected,actual);
    }
}