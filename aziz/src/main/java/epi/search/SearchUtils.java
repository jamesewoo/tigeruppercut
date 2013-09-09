package epi.search;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/9/13
 * Time: 12:26 AM
 */
public class SearchUtils {

    public static <T extends Comparable<T>> int binarySearch(T t, List<T> list) {
        int l = 0;
        int u = list.size() - 1;
        while (l <= u) {
            int m = l + (u - l) / 2;
            if (list.get(m).compareTo(t) < 0) {
                l = m + 1;
            } else if (list.get(m).compareTo(t) == 0) {
                return m;
            } else {
                u = m - 1;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> int bSearchNext(T t, List<T> list) {
        int l = 0;
        int u = list.size() - 1;
        int ret = -1;
        while (l <= u) {
            int m = l + (u - l) / 2;
            if (list.get(m).compareTo(t) <= 0) {
                l = m + 1;
            } else {
                ret = u;
                u = m - 1;
            }
        }
        return ret;
    }
}
