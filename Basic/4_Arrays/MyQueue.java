import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Implementation of queue using array
 * @author Shane
 * @date 2019-12-03
 */

public class MyQueue {
    private int[] storage;
    private int capacity;
    private int head;
    private int tail;
    private int count;
    private static final int EXPAND_CONST = 2;

    private MyQueue() {
        this.capacity = 8;
        this.count = 0;
        this.head = 0;
        this.tail = 0;
        this.storage = new int[8];
    }

    private MyQueue(int initSize) {
        if (initSize < 1) throw new IllegalArgumentException("Capacity too small!");
        this.capacity = initSize;
        this.storage = new int[initSize];
        this.count = 0;
        this.head = 0;
        this.tail = 0;
    }

    private void add(int elem) {
        if (isFull()) throw new IllegalArgumentException("Queue is full!");
        storage[tail++] = elem;
        count++;
    }

    private boolean offer(int elem) {
        if (isFull()) return false;
        storage[tail++] = elem;
        count++;
        return true;
    }

    private void put(int elem) {
        if (isFull()) expandQueue();
        storage[tail++] = elem;
        count++;
    }

    private void expandQueue() {
        storage = Arrays.copyOf(storage, capacity * EXPAND_CONST);
        capacity = capacity * EXPAND_CONST;
    }

    private int element() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty!");
        return storage[head];
    }

    private int remove() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty!");
        count--;
        return storage[head++];
    }

    private int poll() {
        if (isEmpty()) return Integer.parseInt(null);
        count--;
        return storage[head++];
    }

    private int peek() {
        if (isEmpty()) return Integer.parseInt(null);
        return storage[head];
    }

    private boolean isEmpty() { return count == 0; }

    private boolean isFull() {
        return count == capacity;
    }

    private int size() {
        return count;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        System.out.println(myQueue.isFull());
        // myQueue.add(5);
        myQueue.put(5);
        System.out.println(myQueue.isFull());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.size());
        for (int i = 0; i < 4; i++) {
            System.out.println(myQueue.poll());
        }
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.element());
    }
}
