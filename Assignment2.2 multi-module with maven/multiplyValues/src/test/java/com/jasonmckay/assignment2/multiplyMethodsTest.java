package com.jasonmckay.assignment2;

import junit.framework.Assert;
import org.junit.*;

/**
 * Created by Jason McKay on 2016/03/05.
 */
public class multiplyMethodsTest
{
    @Before
    public void setUp() throws Exception
    {


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
