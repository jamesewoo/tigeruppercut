package epi.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 10/5/13
 * Time: 9:48 AM
 */
public class SortUtils {

    /**
     * Finds the intersection of two sorted arrays.
     *
     * @param a   a sorted array
     * @param b   a sorted array of similar size to <code>a</code>
     * @param <T> element type
     * @return the intersection of two sorted arrays
     */
    public static <T extends Comparable<T>> Object[] intersect(T[] a, T[] b) {
        if (a.length == 0 || b.length == 0)
            return new Object[0];
        List<T> ret = new ArrayList<>();
        int i = 0;
        for (T val : a) {
            while (i < b.length && val.compareTo(b[i]) > 0) {
                ++i;
            }
            if (i < b.length && val.compareTo(b[i]) == 0) {
                ret.add(val);
                ++i;
            }
        }
        return ret.toArray();
    }
}
