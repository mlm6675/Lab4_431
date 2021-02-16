package TrianglePKG;

public class Triangles {
    public String foo(int a, int b, int c)
    {
        if ((a + b) < c || (a + c) < b || (c + b) < a )
        {
            return "EXCEPTION";
        }
        else
        {
            if(a == b && a == c)
            {
                return "equilateral";
            }
            else if (a == b || a == c || b == c)
            {
                return "isosceles";
            }
            else
            {
                return "scalene";
            }
        }
    }
}