package epi.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 10/5/13
 * Time: 10:29 AM
 */
public class SortUtilsTest {

    @Test
    public void testIntersect() {
        assertArrayEquals(new Integer[]{}, SortUtils.intersect(new Integer[]{}, new Integer[]{}));
        assertArrayEquals(new Integer[]{}, SortUtils.intersect(new Integer[]{0}, new Integer[]{1}));
        assertArrayEquals(new Integer[]{}, SortUtils.intersect(new Integer[]{1}, new Integer[]{0}));
        assertArrayEquals(new Integer[]{1}, SortUtils.intersect(new Integer[]{1}, new Integer[]{1}));
        assertArrayEquals(new Integer[]{}, SortUtils.intersect(new Integer[]{0}, new Integer[]{1, 2}));
        assertArrayEquals(new Integer[]{}, SortUtils.intersect(new Integer[]{1, 2}, new Integer[]{0}));
        assertArrayEquals(new Integer[]{1}, SortUtils.intersect(new Integer[]{1}, new Integer[]{1, 2}));
        assertArrayEquals(new Integer[]{1}, SortUtils.intersect(new Integer[]{1, 2}, new Integer[]{1}));
        assertArrayEquals(new Integer[]{2}, SortUtils.intersect(new Integer[]{2}, new Integer[]{1, 2}));
        assertArrayEquals(new Integer[]{2}, SortUtils.intersect(new Integer[]{1, 2}, new Integer[]{2}));
        assertArrayEquals(new Integer[]{2}, SortUtils.intersect(new Integer[]{0, 2}, new Integer[]{1, 2}));
        assertArrayEquals(new Integer[]{2}, SortUtils.intersect(new Integer[]{1, 2}, new Integer[]{0, 2}));
        assertArrayEquals(new Integer[]{1, 2}, SortUtils.intersect(new Integer[]{1, 2}, new Integer[]{1, 2}));
        assertArrayEquals(new Integer[]{1, 3}, SortUtils.intersect(new Integer[]{1, 3}, new Integer[]{1, 2, 3}));
        assertArrayEquals(new Integer[]{1, 3}, SortUtils.intersect(new Integer[]{1, 2, 3}, new Integer[]{1, 3}));
    }
}
