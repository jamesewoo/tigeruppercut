package epi.heap;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/7/13
 * Time: 11:07 PM
 */
public class HeapUtils {

    public <T extends Comparable<T>> List<T> merge(List<Iterator<T>> vectors) {
        Queue<Entry<T>> heap = new PriorityQueue<>(vectors.size(), new Comparator<Entry<T>>() {
            @Override
            public int compare(Entry<T> o1, Entry<T> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (int i = 0; i < vectors.size(); ++i) {
            if (vectors.get(i).hasNext())
                heap.add(new Entry<>(i, vectors.get(i).next()));
        }

        List<T> ret = new ArrayList<>();
        while (!heap.isEmpty()) {
            Entry<T> entry = heap.remove();
            ret.add(entry.getValue());

            Iterator<T> it = vectors.get(entry.getIndex());
            if (it.hasNext())
                heap.add(new Entry<>(entry.getIndex(), it.next()));
        }
        return ret;
    }

    private class Entry<T> {
        private int index;
        private T value;

        public Entry(int index, T value) {
            this.index = index;
            this.value = value;
        }

        private int getIndex() {
            return index;
        }

        private T getValue() {
            return value;
        }
    }
}
