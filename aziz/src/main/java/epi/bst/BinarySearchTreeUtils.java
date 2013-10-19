package epi.bst;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 10/19/13
 * Time: 3:32 PM
 */
public class BinarySearchTreeUtils<T extends Comparable<? super T>> {

    public boolean verify(BinarySearchTree<T> bst) {
        if (bst == null)
            return true;
        T data = bst.getData();
        BinarySearchTree<T> left = bst.getLeft();
        BinarySearchTree<T> right = bst.getRight();

        if (left != null && left.getData().compareTo(data) > 0)
            return false;
        if (right != null && right.getData().compareTo(data) < 0)
            return false;
        return verify(left) && verify(right);
    }
}
