package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTestNG {

    // remain(1000) -> 1000 - (1000 % 1000) = 1000
    @Test
    public void shouldReturnRemainFor1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    // remain(900) -> 1000 - 900 = 100
    @Test
    public void shouldReturnRemainFor900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    // remain(0) -> 1000 - 0 = 1000
    @Test
    public void shouldReturnRemainFor0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    // remain(1501) -> 1000 - (1501 % 1000) = 1000 - 501 = 499
    @Test
    public void shouldReturnRemainFor1501() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1501);
        int expected = 499;
        Assert.assertEquals(actual, expected);
    }

}