package epi.search;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/9/13
 * Time: 12:44 AM
 */
public class SearchUtilsTest {

    @Test
    public void testBinarySearch() {
        List<Integer> list = Arrays.asList(-14, -10, 2, 108, 108, 243, 285, 285, 285, 401);
        assertEquals(-1, SearchUtils.bSearchNext(500, list));
        assertEquals(3, SearchUtils.bSearchNext(101, list));
        assertEquals(6, SearchUtils.bSearchNext(244, list));
        assertEquals(0, SearchUtils.bSearchNext(-15, list));
        assertEquals(9, SearchUtils.bSearchNext(400, list));
    }
}
