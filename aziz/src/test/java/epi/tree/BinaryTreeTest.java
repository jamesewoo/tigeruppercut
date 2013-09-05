package epi.tree;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/4/13
 * Time: 11:17 PM
 */
public class BinaryTreeTest {

    @Test
    public void testInorderTraversal() {
        BinaryTree<Integer> s = new BinaryTree<>(1);
        BinaryTree<Integer> t = new BinaryTree<>(2);
        BinaryTree<Integer> u = new BinaryTree<>(3);
        s.setLeft(t);
        s.setRight(u);
        t.setLeft(new BinaryTree<>(4));
        t.setRight(new BinaryTree<>(5));
        u.setLeft(new BinaryTree<>(6));
        u.setRight(new BinaryTree<>(7));

        s.inorderTraversal();
    }
}
