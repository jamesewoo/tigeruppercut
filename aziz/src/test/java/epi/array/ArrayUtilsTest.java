package epi.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/3/13
 * Time: 12:07 AM
 */
public class ArrayUtilsTest {

    @Test
    public void testSwap() {
        int[] arr = new int[]{2, 1, 7, 0, 2};
        ArrayUtils.swap(arr, 0, 2);
        assertEquals(7, arr[0]);
        assertEquals(2, arr[2]);
        ArrayUtils.swap(arr, 3, 4);
        assertEquals(2, arr[3]);
        assertEquals(0, arr[4]);
    }

    @Test
    public void testPartition() {
        int[] arr = new int[]{2, 1, 7, 0, 2};
        ArrayUtils.partition(arr, 4);
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
            if (i < 4)
                assertTrue(arr[i] <= arr[4]);
            else if (i > 4)
                assertTrue(arr[i] >= arr[4]);
        }
    }
}
