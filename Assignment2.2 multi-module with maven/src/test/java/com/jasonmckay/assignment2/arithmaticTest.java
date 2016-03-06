package com.jasonmckay.assignment2;

import org.junit.*;

/**
 * Created by Jason McKay on 2016/03/06.
 */
public class arithmaticTest
{
    @Before
    public void setUp() throws Exception
    {


    }

    @Test
    public void testArithmatic() throws Exception
    {
        arithmatic maths = new arithmatic();
        boolean result = maths.calculate();

        Assert.assertTrue(result);
    }
}
