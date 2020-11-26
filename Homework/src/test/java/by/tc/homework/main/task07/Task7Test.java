package by.tc.homework.main.task07;

import org.junit.Assert;
import org.junit.Test;

import static by.tc.homework.main.task07.Task7.closerToOrigin;

public class Task7Test {

    @Test
    public void testCloserToOrigin01() {
        Point A = new Point(4,2);
        Point B = new Point(3,6);
        Point expected = A;
        Point actual = closerToOrigin(A,B);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCloserToOrigin02() {
        Point A = new Point(9,6);
        Point B = new Point(7,2);
        Point expected = B;
        Point actual = closerToOrigin(A,B);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testCloserToOrigin04() {
        Point A = new Point(3,6);
        Point B = new Point(6,3);
        Point expected = new Point(0,0);
        Point actual = closerToOrigin(A,B);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = NullPointerException.class)
    public void testCloserToOrigin05() {
        Point A = null;
        Point B = new Point(6,3);
        closerToOrigin(A,B);
    }

    @Test(expected = NullPointerException.class)
    public void testCloserToOrigin06() {
        Point A = new Point(3,6);
        Point B = null;
        closerToOrigin(A,B);
    }
}