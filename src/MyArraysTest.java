import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.assertEquals;

public class MyArraysTest {

    @Test
    public void testBinarySearchByte() {
        byte[] byteArray = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(3, MyArrays.binarySearch(byteArray, (byte) 5));
        assertEquals(-10, MyArrays.binarySearch(byteArray, (byte) 11));
    }

    @Test
    public void testBinarySearchChar() {
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        assertEquals(4, MyArrays.binarySearch(charArray, 'e'));
        assertEquals(-10, MyArrays.binarySearch(charArray, 'j'));
    }

    @Test
    public void testBinarySearchDouble() {
        double[] doubleArray = {1.1, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};
        assertEquals(3, MyArrays.binarySearch(doubleArray, 5.5));
        assertEquals(-10, MyArrays.binarySearch(doubleArray, 11.1));
    }

    @Test
    public void testBinarySearchFloat() {
        float[] floatArray = {1.1f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.1f};
        assertEquals(3, MyArrays.binarySearch(floatArray, 5.5f));
        assertEquals(-10, MyArrays.binarySearch(floatArray, 11.1f));
    }

    @Test
    public void testBinarySearchInt() {
        int[] intArray = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(3, MyArrays.binarySearch(intArray, 5));
        assertEquals(-10, MyArrays.binarySearch(intArray, 11));
    }

    @Test
    public void testBinarySearchLong() {
        long[] longArray = {1L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L};
        assertEquals(3, MyArrays.binarySearch(longArray, 5L));
        assertEquals(-10, MyArrays.binarySearch(longArray, 11L));
    }

    @Test
    public void testBinarySearchShort() {
        short[] shortArray = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(3, MyArrays.binarySearch(shortArray, (short) 5));
        assertEquals(-10, MyArrays.binarySearch(shortArray, (short) 11));
    }

    @Test
    public void testBinarySearchGeneric() {
        String[] stringArray = {"apple", "banana", "cherry", "elderberry"};
        Arrays.sort(stringArray);
        assertEquals(3, MyArrays.binarySearch(stringArray, "elderberry"));
        assertEquals(-5, MyArrays.binarySearch(stringArray, "kiwi"));
    }

    @Test
    public void testBinarySearchGenericComparator() {
        String[] stringArray = {"apple", "banana", "cherry", "elderberry"};
        // Используем встроенный в Comparator метод reverseOrder
        Comparator<String> comparator = Comparator.reverseOrder();
        // Явно сортируем список
        Arrays.sort(stringArray, comparator);

        assertEquals(0, MyArrays.binarySearch(stringArray, "elderberry", comparator));
        assertEquals(-1, MyArrays.binarySearch(stringArray, "kiwi", comparator));
    }
}
