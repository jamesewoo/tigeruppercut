import epi.linkedlist.LinkedListUtil;
import epi.linkedlist.Node;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/1/13
 * Time: 2:56 PM
 */
public class LinkedListTest {

    @Test
    public void test() {
        Node<Integer> a = null, b = null, prev = null;
        for (Integer i : new Integer[]{7, 5, 2}) {
            a = new Node<>(i);
            a.setNext(prev);
            prev = a;
        }

        prev = null;
        for (Integer i : new Integer[]{11, 3}) {
            b = new Node<>(i);
            b.setNext(prev);
            prev = b;
        }

        Node<Integer> c = LinkedListUtil.merge(a, b);
        while (c != null) {
            System.out.println(c.getData());
            c = c.getNext();
        }
    }
}
