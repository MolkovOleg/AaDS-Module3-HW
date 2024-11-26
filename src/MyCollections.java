import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCollections {

    // 1. binarySearch Collection with Comparable
    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        return Collections.binarySearch(list, key);
    }


    // 2. binarySearch Collection with Comparator
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        return Collections.binarySearch(list, key, c);

    }
}
