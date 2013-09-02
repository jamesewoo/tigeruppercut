package epi.linkedlist;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/1/13
 * Time: 2:46 PM
 */
public class LinkedListUtil {

    public static <T extends Comparable<T>> Node<T> merge(Node<T> a, Node<T> b) {
        Node<T> head_c = null, c = null, tmp;
        while (a != null && b != null) {
            if (a.getData().compareTo(b.getData()) <= 0) {
                tmp = a;
                a = a.getNext();
                if (c == null) {
                    head_c = tmp;
                    c = tmp;
                } else {
                    c.setNext(tmp);
                    c = tmp;
                }
            } else {
                tmp = b;
                b = b.getNext();
                if (c == null) {
                    head_c = tmp;
                    c = tmp;
                } else {
                    c.setNext(tmp);
                    c = tmp;
                }
            }
        }
        if (a == null && b != null)
            c.setNext(b);
        else if (a != null && b == null)
            c.setNext(a);
        return head_c;
    }

}
