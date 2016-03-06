package com.jasonmckay.assignment2;

import junit.framework.*;
import org.junit.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Jason McKay on 2016/03/06.
 */
public class divideMethodsTest
{
    @Before
    public void setUp() throws Exception
    {


    }

    @Test
    public void testDivideIntegers() throws Exception
    {
        divideMethods divideInt = new divideMethods();
        int result = divideInt.divideValues(9, 3);

        Assert.assertEquals(3, result);
    }

    @Test
    public void testMultiplyIntegers() throws Exception
    {
        multiplyMethods multiplyInt = new multiplyMethods();
        int result = multiplyInt.multiplyValues(5, 5);

        Assert.assertEquals(25, result);
    }

    @Test
    public void testSubIntegers() throws Exception
    {
        subMethods subInt = new subMethods();
        int result = subInt.subValues(9, 3);

        Assert.assertEquals(6, result);
    }

    @Test
    public void testAddIntegers() throws Exception
    {
        addMethods addInt = new addMethods();
        int result = addInt.addValues(5, 8);

        Assert.assertEquals(13, result);
    }

    @Test
    public void testArithmatic() throws Exception
    {
        arithmatic maths = new arithmatic();
        boolean result = maths.calculate();

        Assert.assertTrue(result);
    }
}
