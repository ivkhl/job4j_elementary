package ru.job4j.calculator;


import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan187Then101() {
        short in = 187;
        double expected = 100;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.05);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.05);
    }
}