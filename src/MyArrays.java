import java.util.Arrays;
import java.util.Comparator;

public class MyArrays {

    // 1. binarySearch массива byte элементов
    public static int binarySearch(byte[] a, byte key) {
        return Arrays.binarySearch(a, key);
    }

    // 2. binarySearch массива byte элементов
    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 3. binarySearch массива char элементов
    public static int binarySearch(char[] a, char key) {
        return Arrays.binarySearch(a, key);
    }

    // 4. binarySearch массива char элементов
    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 5. binarySearch массива double элементов
    public static int binarySearch(double[] a, double key) {
        return Arrays.binarySearch(a, key);
    }

    // 6. binarySearch массива double элементов
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 7. binarySearch массива float элементов
    public static int binarySearch(float[] a, float key) {
        return Arrays.binarySearch(a, key);
    }

    // 8. binarySearch массива float элементов
    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 9. binarySearch массива int элементов
    public static int binarySearch(int[] a, int key) {
        return Arrays.binarySearch(a, key);
    }

    // 10. binarySearch массива int элементов
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 11. binarySearch массива long элементов
    public static int binarySearch(long[] a, long key) {
        return Arrays.binarySearch(a, key);
    }

    // 12. binarySearch массива long элементов
    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 13. binarySearch массива short элементов
    public static int binarySearch(short[] a, short key) {
        return Arrays.binarySearch(a, key);
    }

    // 14. binarySearch массива short элементов
    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 15. binarySearch массива c Generic и Comparator
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return Arrays.binarySearch(a, key, c);
    }

    // 16. binarySearch массива c Generic и Comparator
    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key, c);
    }

    // 17. binarySearch массива c Generic
    public static <T> int binarySearch(T[] a, T key) {
        return Arrays.binarySearch(a, key);
    }
}
