package epi.array;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/2/13
 * Time: 11:32 PM
 */
public class ArrayUtils {

    // i = 3
    // 2,1,7,2,0
    // 2,1,7,2,0 eq = 1
    // 1,2,7,2,0 eq = 2, be = 1
    // 1,2,0,2,7 eq = 2, en = 3
    // 1,0,2,2,7 eq = 3, be = 2
    // 1,0,2,2,7 eq = 4

    public static void partition(int[] arr, int index) {
        int begin = 0, equals = 0, end = arr.length - 1;
        int t = arr[index];
        while (equals <= end) {
            if (arr[equals] < t) {
                swap(arr, equals++, begin++);
            } else if (arr[equals] == t) {
                equals++;
            } else {
                swap(arr, equals, end--);
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
}
