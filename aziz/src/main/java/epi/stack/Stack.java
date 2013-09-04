package epi.stack;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/3/13
 * Time: 8:19 PM
 */
public class Stack<T extends Comparable<T>> {

    private Node<T> top;

    public void push(T value) {
        if (value == null)
            throw new IllegalArgumentException("value cannot be null");

        Node<T> node = new Node<>();
        node.setValue(value);
        node.setNext(top);
        if (top == null) {
            node.setMaxValue(value);
        } else {
            T max = max();
            if (max == null)
                node.setMaxValue(null);
            else if (value.compareTo(max) >= 0)
                node.setMaxValue(value);
            else
                node.setMaxValue(max);
        }
        top = node;
    }

    public T pop() {
        if (top == null)
            throw new IllegalStateException("empty stack");
        T ret = top.getValue();
        top = top.getNext();
        return ret;
    }

    public T peek() {
        if (top != null)
            return top.getValue();
        return null;
    }

    public T max() {
        if (top != null)
            return top.getMaxValue();
        return null;
    }

    public class Node<T> {

        private T value;

        private T max;

        private Node<T> next;

        private Node<T> getNext() {
            return next;
        }

        private void setNext(Node<T> next) {
            this.next = next;
        }

        private T getMaxValue() {
            return max;
        }

        private void setMaxValue(T max) {
            this.max = max;
        }

        private T getValue() {
            return value;
        }

        private void setValue(T value) {
            this.value = value;
        }

    }
}
