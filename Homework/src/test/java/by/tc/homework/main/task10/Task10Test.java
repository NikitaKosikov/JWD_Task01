package by.tc.homework.main.task10;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static by.tc.homework.main.task10.Task10.functionValueOnSegment;
import static by.tc.homework.main.task10.Task10.printTable;

public class Task10Test {

    @Test
    public void testFunctionValueOnSegment01() {
        double a=2.264,b = 4.4, h = 0.45;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment02() {
        double a=35.4,b = 35.4, h = 0.5;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment03() {
        double a=2.264,b = 7.4, h = 0;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment04() {
        double a=35.4,b = 35.4, h = 0;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }


    @Test
    public void testFunctionValueOnSegment05() {
        double a=21.543,b = 15.12, h = 0.5;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment06() {
        double a=25,b = 12.21, h = 0;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment07() {
        double a=Double.NaN,b = Double.NaN, h = Double.NaN;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment08() {
        double a=7,b = Double.NaN, h = Double.NaN;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment09() {
        double a=Double.NaN,b = 7, h = Double.NaN;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment10() {
        double a=Double.NaN,b = Double.NaN, h = 7;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment11() {
        double a=2,b = 5, h = Double.NaN;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment12() {
        double a=5,b = Double.NaN, h = 3;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment13() {
        double a=Double.NaN,b = 7, h = 3;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment14() {
        double a=5,b = 2, h = Double.NaN;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }

    @Test
    public void testFunctionValueOnSegment15() {
        double a=5,b = 5, h = Double.NaN;
        double x=a;
        Map<Double, Double> expected = new LinkedHashMap<>();
        while (a<=b && h!=0){
            expected.put(a, Math.tan(a));
            a+=h;
        }
        Map<Double, Double>  actual = functionValueOnSegment(x,b,h);
        Assert.assertEquals(expected, actual);
        printTable(actual, x, h);
    }
}