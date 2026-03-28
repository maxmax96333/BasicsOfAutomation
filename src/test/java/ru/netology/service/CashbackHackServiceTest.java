package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainFor1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainFor900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainFor0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainFor1501() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1501);
        int expected = 499;
        Assert.assertEquals(actual, expected);
    }

}
