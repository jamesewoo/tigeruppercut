package epi.map;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/10/13
 * Time: 2:07 AM
 */
public class HashTableUtilsTest {

    @Test
    public void testAnonymousLetter() {
        assertTrue(HashTableUtils.anonymousLetter("tiger", "tigress"));
        assertTrue(HashTableUtils.anonymousLetter("rampage", "red champagne"));
        assertTrue(HashTableUtils.anonymousLetter("age ramp", "red champagne"));
        assertTrue(HashTableUtils.anonymousLetter("impossible", "mission pebble"));
        assertTrue(HashTableUtils.anonymousLetter("", ""));
        assertFalse(HashTableUtils.anonymousLetter("calculus", "calculi"));
        assertFalse(HashTableUtils.anonymousLetter("mount vernon", "mount vesuvius"));
    }
}
