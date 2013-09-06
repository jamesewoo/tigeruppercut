package epi.tree;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/4/13
 * Time: 11:16 PM
 */
public class BinaryTree<T> {

    private T data;
    private BinaryTree<T> left;
    private BinaryTree<T> right;
    private BinaryTree<T> parent;

    public BinaryTree() {
    }

    public BinaryTree(T data) {
        this.data = data;
    }

    void inorderRecursive() {
        if (left != null)
            left.inorderRecursive();
        System.out.println(data);
        if (right != null)
            right.inorderRecursive();
    }

    void inorderTraversal() {
        BinaryTree<T> n = this;
        BinaryTree<T> prev = null;
        boolean down = true;
        while (n != null) {
            if (down) {
                if (n.left != null) {
                    n = n.left;
                } else if (n.right != null) {
                    System.out.println(n.data);
                    n = n.right;
                } else {    // n is leaf node
                    down = false;
                }
            } else {
                if (n.parent == null) {
                    return;
                } else if (n == n.parent.left) {
                    if (prev == null || prev != n.right) {
                        System.out.println(n.data);
                        prev = null;
                    }
                    n = n.parent;
                    if (n.right != null) {
                        System.out.println(n.data);
                        n = n.right;
                        down = true;
                    }
                } else {
                    if (n.left == null & n.right == null)
                        System.out.println(n.data);
                    prev = n;
                    n = n.parent;
                }
            }
        }
    }

    void morrisTraversal() {
        BinaryTree<T> n = this;
        while (n != null) {
            if (n.left != null) {
                // find predecessor of n
                BinaryTree<T> pre = n.left;
                while (pre.right != null && pre.right != n) {
                    pre = pre.right;
                }

                // build successor link
                if (pre.right != null) { // pre.right == n
                    // revert successor link if predecessor's successor is n
                    pre.right = null;
                    System.out.println(n.data);
                    n = n.right;
                } else { // if predecessor's successor is not n
                    pre.right = n;
                    n = n.left;
                }
            } else {
                System.out.println(n.data);
                n = n.right;
            }
        }
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTree<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTree<T> left) {
        this.left = left;
    }

    public BinaryTree<T> getRight() {
        return right;
    }

    public void setRight(BinaryTree<T> right) {
        this.right = right;
    }

    public BinaryTree<T> getParent() {
        return parent;
    }

    public void setParent(BinaryTree<T> parent) {
        this.parent = parent;
    }
}
