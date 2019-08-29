import org.junit.*;

import static org.junit.Assert.assertEquals;
public class JUnitTest {
    @Test
    public void test_findMax() {
        Finder test = new Finder();
        int[] intArray = new int[]{1,2,3,4,5};
        int expected = 5;
        int actual = test.findMax(intArray);
        //actual test
        assertEquals(actual, expected);
        System.out.print("Finding the maximum number (5) in the array was successful.");
    }

    @Test
    public void test_findMin() {
        Finder test = new Finder();
        int[] intArray = new int[]{1,2,3,4,5};
        int expected = 1;
        int actual = test.findMin(intArray);
        //actual test
        assertEquals(actual, expected);
        System.out.print("Finding the minimum (1) in the array was successful.");
    }

    @Test
    public void test_findEmptyMax() {
        Finder test = new Finder();
        int[] intArray = new int[]{};
        Integer expected = null;
        Integer actual = test.findMax(intArray);
        //actual test
        assertEquals(actual, expected);
        System.out.print("Identifying that the array was empty using the findMax() function was successful.");
    }

    @Test
    public void test_findEmptyMin() {
        Finder test = new Finder();
        int[] intArray = new int[]{};
        Integer expected = null;
        Integer actual = test.findMin(intArray);
        //actual test
        assertEquals(actual, expected);
        System.out.print("Identifying that the array was empty using the findMin() function was successful.");
    }

    @Test
    public void test_findNullMax() {
        Finder test = new Finder();
        int[] intArray = null;
        Integer expected = null;
        Integer actual = test.findMax(intArray);
        //actual test
        assertEquals(actual, expected);
        System.out.print("Identifying that the array was null using the findMax() function was successful.");
    }

    @Test
    public void test_findNullMin() {
        Finder test = new Finder();
        int[] intArray = null;
        Integer expected = null;
        Integer actual = test.findMin(intArray);
        //actual test
        assertEquals(actual, expected);
        System.out.print("Identifying that the array was null using the findMax() function was successful.");
    }
}
