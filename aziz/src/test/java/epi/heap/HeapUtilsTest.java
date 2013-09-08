package epi.heap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/8/13
 * Time: 5:02 AM
 */
public class HeapUtilsTest {

    @Test
    public void testMerge() {
        HeapUtils utils = new HeapUtils();
        List<Iterator<Integer>> vectors = new ArrayList<>();
        vectors.add(Arrays.asList(2, 5, 7, 8).iterator());
        vectors.add(Arrays.asList(1, 3, 5).iterator());
        vectors.add(Arrays.asList(4, 4, 6).iterator());
        System.out.println(utils.merge(vectors));
    }
}
