package by.tc.homework.main.task04;

import org.junit.Assert;
import org.junit.Test;

import static by.tc.homework.main.task04.Task4.isTwoEvenNumber;

public class Task4Test {

    @Test
    public void testIsTwoEvenNumber01() {
        int []numbers = {8,3,0,15};
        boolean expected = true;
        boolean actual = isTwoEvenNumber(numbers);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIsTwoEvenNumber02() {
        int []numbers = {8,3,1,15};
        boolean expected = false;
        boolean actual = isTwoEvenNumber(numbers);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIsTwoEvenNumber03() {
        int []numbers = {8,3,1,15,20};
        boolean expected = true;
        boolean actual = isTwoEvenNumber(numbers);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIsTwoEvenNumber04() {
        int []numbers = {8};
        boolean expected = false;
        boolean actual = isTwoEvenNumber(numbers);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = NullPointerException.class)
    public void testIsTwoEvenNumber05() {
        int []numbers = null;
        isTwoEvenNumber(numbers);
    }
}