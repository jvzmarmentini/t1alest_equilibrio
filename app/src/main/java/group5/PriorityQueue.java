package group5;

/**
 * PriorityQueue
 */
public class PriorityQueue<T extends Comparable<T>> {
    private MinHeap<T> queue;

    public PriorityQueue() {
        queue = new MinHeap<>();
    }

    public PriorityQueue(int length) {
        queue = new MinHeap<>(length);
    }

    public void insert(T t) {
        queue.insert(t);
    }

    public T remove() {
        return queue.removeMin();
    }
}