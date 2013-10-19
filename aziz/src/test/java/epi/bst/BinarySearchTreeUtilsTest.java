package epi.bst;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 10/19/13
 * Time: 3:48 PM
 */
public class BinarySearchTreeUtilsTest {

    @Test
    public void testVerify() {
        BinarySearchTree<Integer> b2 = new BinarySearchTree<>(2);
        BinarySearchTree<Integer> b3 = new BinarySearchTree<>(3);
        BinarySearchTree<Integer> b5 = new BinarySearchTree<>(5);
        BinarySearchTree<Integer> b7 = new BinarySearchTree<>(7);
        BinarySearchTree<Integer> b11 = new BinarySearchTree<>(11);
        BinarySearchTree<Integer> b13 = new BinarySearchTree<>(13);
        BinarySearchTree<Integer> b17 = new BinarySearchTree<>(17);
        BinarySearchTree<Integer> b19 = new BinarySearchTree<>(19);
        BinarySearchTree<Integer> b23 = new BinarySearchTree<>(23);
        BinarySearchTree<Integer> b29 = new BinarySearchTree<>(29);
        BinarySearchTree<Integer> b31 = new BinarySearchTree<>(31);
        BinarySearchTree<Integer> b37 = new BinarySearchTree<>(37);
        BinarySearchTree<Integer> b41 = new BinarySearchTree<>(41);
        BinarySearchTree<Integer> b43 = new BinarySearchTree<>(43);
        BinarySearchTree<Integer> b47 = new BinarySearchTree<>(47);
        BinarySearchTree<Integer> b53 = new BinarySearchTree<>(53);

        b19.setLeft(b7);
        b19.setRight(b43);
        b7.setLeft(b3);
        b7.setRight(b11);
        b3.setLeft(b2);
        b3.setRight(b5);
        b11.setRight(b17);
        b17.setLeft(b13);
        b43.setLeft(b23);
        b43.setRight(b47);
        b23.setRight(b37);
        b47.setRight(b53);
        b37.setLeft(b29);
        b37.setRight(b41);
        b29.setRight(b31);

        BinarySearchTreeUtils<Integer> utils = new BinarySearchTreeUtils<>();
        assertTrue(utils.verify(b19));

        b31.setRight(new BinarySearchTree<>(30));
        assertFalse(utils.verify(b19));

        b31.setRight(null);
        assertTrue(utils.verify(b19));
        b31.setLeft(new BinarySearchTree<>(32));
        assertFalse(utils.verify(b19));
    }
}
