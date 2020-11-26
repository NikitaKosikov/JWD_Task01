package by.tc.homework.main.task05;

import org.junit.Assert;
import org.junit.Test;

import static by.tc.homework.main.task05.Task5.isNumberPerfect;

public class Task5Test {

    @Test
    public void testIsNumberPerfect01() {
        int perfectNumber = 33_550_336;
        boolean expected = true;
        boolean actual = isNumberPerfect(perfectNumber);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIsNumberPerfect02() {
        int perfectNumber =35;
        boolean expected = false;
        boolean actual = isNumberPerfect(perfectNumber);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIsNumberPerfect03() {
        int perfectNumber = 1;
        boolean expected = false;
        boolean actual = isNumberPerfect(perfectNumber);
        Assert.assertEquals(expected,actual);
    }
}