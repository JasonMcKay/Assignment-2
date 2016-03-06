package TestFixtures;

import org.junit.*;

import java.util.*;

/**
 * Created by student on 2016/03/03.
 */
public class TestMethods
{
    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before.");

    }

    // Test fixture testing floating points
    @Test
    public void testFloatingPoints() throws Exception
    {
        Methods floatingPoints = new Methods();
        float result = floatingPoints.divideValues(9, 3);
        // 4 is for the amount of decimal places
        Assert.assertEquals(3.0, result, 4);
    }

    // Test fixture testing integers
    @Test
    public void testIntegers() throws Exception
    {
        Methods integers = new Methods();
        int result = integers.addValues(4, 8);

        Assert.assertEquals(12, result);
    }

    // Test fixture testing if objects belong to the same class
    @Test
    public void testObjectEquality() throws Exception
    {
        String s1 = "bla";
        ArrayList a1 = new ArrayList(); // Objects for testing
        Methods equality = new Methods();
        String result = equality.getObject();

        Assert.assertSame(s1.getClass(), result.getClass());
    }

    // Test fixture testing if the objects have the same value/identity
    @Test
    public void testObjectIdentity() throws Exception
    {
        String s1 = "bla bla";
        String t1 = "hello"; // Objects for testing
        Methods identity = new Methods();
        String result = identity.getObject();

        Assert.assertSame(s1, result);
    }

    // Test fixture testing if boolean is true
    @Test
    public void testTruth() throws Exception
    {
        Methods truth = new Methods();
        boolean result = truth.validateValues(4, 4);

        Assert.assertTrue("Test Failed: resualt was false and not true", result);
    }

    // Test fixture testing if boolean is false
    @Test
    public void testFalse() throws Exception
    {
        Methods notTrue = new Methods();
        boolean result = notTrue.falseValues();

        Assert.assertFalse("Test Failed: resualt was true and not false", result);
    }

    // Test fixture testing if an object is null
    @Test
    public void testNullness() throws Exception
    {
        Methods nullness = new Methods();
        Object result = nullness.getObjectNull();

        Assert.assertNull("Test Failed: result was not null", result);
    }

    // Test fixture testing if an object is not null
    @Test
    public void testNotNull() throws Exception
    {
        Methods notNull = new Methods();
        Object result = notNull.getObject();

        Assert.assertNotNull("Test Failed: result was null", result);
    }

    // Test fixture testing a failing test and disabling/ignoring a test
    @Ignore
    public void testFail() throws Exception
    {
        Assert.fail("Failing Test");
    }

    // Test fixture testing timeouts
    @Test(timeout = 60000) // 60 000ms = 1 minute
    public void testTimeOut() throws Exception
    {
        System.out.println("Test Timed out");

    }

    // Test fixture testing arrays content
    @Test
    public void testArrayContent() throws Exception
    {
        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {4, 5, 6};

        Assert.assertArrayEquals(list1, list2);

    }
}
