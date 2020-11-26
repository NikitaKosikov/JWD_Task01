package by.tc.homework.main.task09;

import org.junit.Assert;
import org.junit.Test;

import static by.tc.homework.main.task09.Task9.areaCircle;
import static by.tc.homework.main.task09.Task9.lengthCircle;

public class Task9Test {

    @Test
    public void testAreaCircle01() {
        double radius = 5.321;
        double expected = Math.PI * radius * radius;
        double actual = areaCircle(radius);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testAreaCircle02() {
        double radius = Double.NaN;
        double expected = Double.NaN;
        double actual = areaCircle(radius);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testAreaCircle03() {
        double radius = Double.POSITIVE_INFINITY;
        double expected = Double.POSITIVE_INFINITY;
        double actual = areaCircle(radius);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testAreaCircle04() {
        double radius = Double.NEGATIVE_INFINITY;
        double expected = Double.POSITIVE_INFINITY;
        double actual = areaCircle(radius);
        Assert.assertEquals(expected, actual, 0.0);
    }


    @Test
    public void testLengthCircle01() {
        double radius = 5;
        double expected = 2 * Math.PI * radius;
        double actual = lengthCircle(radius);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testLengthCircle02() {
        double radius = Double.NaN;
        double expected = Double.NaN;
        double actual = lengthCircle(radius);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testLengthCircle03() {
        double radius = Double.POSITIVE_INFINITY;
        double expected = Double.POSITIVE_INFINITY;
        double actual = lengthCircle(radius);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testLengthCircle04() {
        double radius = Double.NEGATIVE_INFINITY;
        double expected = Double.NEGATIVE_INFINITY;
        double actual = lengthCircle(radius);
        Assert.assertEquals(expected, actual, 0.0);
    }
}