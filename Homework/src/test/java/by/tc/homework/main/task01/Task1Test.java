package by.tc.homework.main.task01;

import org.junit.Assert;
import org.junit.Test;

import static by.tc.homework.main.task01.Task1.searchLastDigitInSquare;

public class Task1Test {

    @Test
    public void testSearchLastNumber01() {
        Number number = 152;
        int expected = 4;
        int actual = searchLastDigitInSquare(number);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSearchLastNumber02() {
        Number number = 152.249;
        int expected = 1;
        int actual = searchLastDigitInSquare(number);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = NumberFormatException.class)
    public void testSearchLastNumber03() {
        Number number = null;
        searchLastDigitInSquare(number);
    }
}