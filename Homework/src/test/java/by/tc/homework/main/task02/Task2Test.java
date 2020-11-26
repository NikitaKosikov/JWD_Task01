package by.tc.homework.main.task02;

import org.junit.Assert;
import org.junit.Test;

import static by.tc.homework.main.task02.Task2.daysOfMonth;
import static by.tc.homework.main.task02.Task2.isLeapYear;

public class Task2Test {

    @Test
    public void testCountOfDays01() {
        int year = 2000;
        int month = 4;
        int expected = 30;
        int actual = daysOfMonth(year,month);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCountOfDays02() {
        int year = 2001;
        int month = 6;
        int expected = 30;
        int actual = daysOfMonth(year,month);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCountOfDays03() {
        int year = 2000;
        int month = 42;
        int expected = 0;
        int actual = daysOfMonth(year,month);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountOfDays04() {
        int year = 2000;
        int month = -5;
        int expected = 0;
        int actual = daysOfMonth(year,month);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountOfDays05() {
        int year = -2020;
        int month = 25;
        int expected = 0;
        int actual = daysOfMonth(year,month);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsLeapYear01(){
        int year = 2000;
        boolean expected = true;
        boolean actual = isLeapYear(year);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIsLeapYear02(){
        int year = 1000;
        boolean expected = false;
        boolean actual = isLeapYear(year);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIsLeapYear03(){
        int year = 2004;
        boolean expected = true;
        boolean actual = isLeapYear(year);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIsLeapYear04(){
        int year = 2025;
        boolean expected = false;
        boolean actual = isLeapYear(year);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testIsLeapYear05(){
        int year = -2000;
        boolean expected = false;
        boolean actual = isLeapYear(year);
        Assert.assertEquals(expected,actual);
    }
}