package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class JUnit4Test {

    @Test
    public void testRemainLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testExactlyBoundaryShouldReturnZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0; // по логике, а не по текущей реализации
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}