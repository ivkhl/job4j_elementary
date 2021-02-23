package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        double expected = 1.44;
        int p = 6;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}