package TestFixtures;

/**
 * Created by student on 2016/03/03.
 */
public class Methods
{

    public float divideValues(float a, float b)
    {
        if(b != 0)
        {
            return a/b;
        }
        else
        {
            return 0;
        }
    }

    public int addValues(int c, int d)
    {
        return c+d;
    }

    public String getObject()
    {
        return "bla bla";
    }

    public boolean validateValues(int e, int f)
    {
        if (e == f)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean falseValues()
    {
        return false;
    }

    public Object getObjectNull()
    {
        Object obj = null;
        Object obj2 = "hello"; // Objects for testing

        return obj;
    }
}
