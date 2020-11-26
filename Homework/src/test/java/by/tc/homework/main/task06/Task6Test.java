package by.tc.homework.main.task06;

import org.junit.Assert;
import org.junit.Test;

import static by.tc.homework.main.task06.Task6.countTime;

public class Task6Test {

    @Test
    public void testCountTime01() {
        int second = 25865;
        int hours = 7;
        int minutes = 11;
        int seconds = 5;
        int[] expected = {hours, minutes, seconds};
        int[] actual = countTime(second);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void testCountTime02() {
        int second = 0;
        int[] expected = {0,0,0};
        int[] actual = countTime(second);
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void testCountTime03() {
        int second = 9213712;
        int[] expected = {};
        int[] actual = countTime(second);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void testCountTime04() {
        int second = -10;
        int[] expected = {};
        int[] actual = countTime(second);
        Assert.assertArrayEquals(expected,actual);
    }
}