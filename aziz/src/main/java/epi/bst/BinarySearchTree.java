package epi.bst;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 10/19/13
 * Time: 3:33 PM
 */
public class BinarySearchTree<T extends Comparable<? super T>> {

    private final T data;
    private BinarySearchTree<T> left;
    private BinarySearchTree<T> right;

    public BinarySearchTree(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public BinarySearchTree<T> getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTree<T> left) {
        this.left = left;
    }

    public BinarySearchTree<T> getRight() {
        return right;
    }

    public void setRight(BinarySearchTree<T> right) {
        this.right = right;
    }
}
