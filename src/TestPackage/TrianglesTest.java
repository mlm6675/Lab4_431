package TestPackage;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import TrianglePKG.*;

import static org.junit.jupiter.api.Assertions.*;

class TrianglesTest {

    @ParameterizedTest (name = "{0}, {1}, {2}, {3}")
    @CsvSource({
            "1, 100, 150, EXCEPTION",
            "2, 100, 150, EXCEPTION",
            "50, 100, 150, EXCEPTION",
            "99, 100, 150, scalene",
            "100, 100, 150, isosceles",
            "50, 50, 150, EXCEPTION",
            "50, 51, 150, EXCEPTION",
            "50, 149, 150, scalene",
            "50, 150, 150, isosceles",
            "50, 100, 100, isosceles",
            "50, 100, 101, scalene",
            "50, 100, 199, EXCEPTION",
            "50, 100, 200, EXCEPTION",
            "101, 100, 150, scalene",
            "0, 100, 150, EXCEPTION",
            "50, 151, 150, scalene",
            "50, 49, 150, EXCEPTION",
            "50, 100, 201, EXCEPTION",
            "50, 100, 99, scalene"
    })
    public void fooTest(int a, int b, int c, String s)
    {
        Triangles triangle = new Triangles();

        String result = triangle.foo(a, b, c);


        assertEquals(result, s);
    }


}