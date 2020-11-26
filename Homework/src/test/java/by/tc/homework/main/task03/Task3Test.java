package by.tc.homework.main.task03;

import org.junit.Assert;
import org.junit.Test;

import static by.tc.homework.main.task03.Task3.areaInscribedSquare;
import static by.tc.homework.main.task03.Task3.ratioOuterSquareToInnerSquare;

public class Task3Test {

    @Test
    public void testAreaInscribedSquare01() {
        double areaOuterSquare = 15.5;
        double expected = 7.75;
        double actual = areaInscribedSquare(areaOuterSquare);
        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void testAreaInscribedSquare02() {
        double areaOuterSquare = Double.NaN;
        double expected = Double.NaN;
        double actual = areaInscribedSquare(areaOuterSquare);
        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void testAreaInscribedSquare03() {
        double areaOuterSquare = Double.POSITIVE_INFINITY;
        double expected = Double.POSITIVE_INFINITY;
        double actual = areaInscribedSquare(areaOuterSquare);
        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void testAreaInscribedSquare04() {
        double areaOuterSquare = Double.NEGATIVE_INFINITY;
        double expected = Double.NEGATIVE_INFINITY;
        double actual = areaInscribedSquare(areaOuterSquare);
        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void testRatioOuterAreaSquareToInnerAreaSquare01() {
        double areaOuterSquare = 15.5;
        double areaInscribedSquare = 7.75;
        double expected = 2;
        double actual = ratioOuterSquareToInnerSquare(areaOuterSquare, areaInscribedSquare);
        Assert.assertEquals(expected, actual,0.0);
    }

    @Test
    public void testRatioOuterAreaSquareToInnerAreaSquare02() {
        double areaOuterSquare = 15.5;
        double areaInscribedSquare = 0;
        double expected = Double.POSITIVE_INFINITY;
        double actual = ratioOuterSquareToInnerSquare(areaOuterSquare, areaInscribedSquare);
        Assert.assertEquals(expected, actual,0.0);
    }


    @Test
    public void testRatioOuterAreaSquareToInnerAreaSquare03() {
        double areaOuterSquare = 0;
        double areaInscribedSquare = 0;
        double expected = Double.NaN;
        double actual = ratioOuterSquareToInnerSquare(areaOuterSquare, areaInscribedSquare);
        Assert.assertEquals(expected, actual,0.0);
    }

    @Test
    public void testRatioOuterAreaSquareToInnerAreaSquare04() {
        double areaOuterSquare = Double.NaN;
        double areaInscribedSquare = 0;
        double expected = Double.NaN;
        double actual = ratioOuterSquareToInnerSquare(areaOuterSquare, areaInscribedSquare);
        Assert.assertEquals(expected, actual,0.0);
    }

    @Test
    public void  testRatioOuterAreaSquareToInnerAreaSquare05() {
        double areaOuterSquare = 231;
        double areaInscribedSquare = Double.NaN;
        double expected = Double.NaN;
        double actual = ratioOuterSquareToInnerSquare(areaOuterSquare, areaInscribedSquare);
        Assert.assertEquals(expected, actual,0.0);
    }
}