package epi.stack;

import org.junit.Test;

import static java.lang.Integer.valueOf;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/3/13
 * Time: 8:53 PM
 */
public class StackTest {

    @Test
    public void testMax() {
        Stack<Integer> s = new Stack<>();
        assertNull(s.peek());
        assertNull(s.max());

        s.push(2);
        assertEquals(valueOf(2), s.peek());
        assertEquals(valueOf(2), s.max());

        s.push(1);
        assertEquals(valueOf(1), s.peek());
        assertEquals(valueOf(2), s.max());

        s.push(3);
        assertEquals(valueOf(3), s.peek());
        assertEquals(valueOf(3), s.max());

        assertEquals(valueOf(3), s.pop());
        assertEquals(valueOf(2), s.max());

        assertEquals(valueOf(1), s.pop());
        assertEquals(valueOf(2), s.max());

        assertEquals(valueOf(2), s.pop());
        assertNull(s.peek());
        assertNull(s.max());

        try {
            s.pop();
        } catch (IllegalStateException e) {
            // expected
        }
    }

}
