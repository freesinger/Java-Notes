import java.util.Arrays;

/**
 * Implementation of stack using array
 * @author Shane
 * @date 2019-12-03
 */

public class MyStack {
    private int[] storage;
    private int capacity;
    private int count;
    private static final int EXPAND_CONST = 2;

    private MyStack() {
        this.capacity = 8;
        this.storage = new int[8];
        this.count = 0;
    }

    private MyStack(int initcapcity) {
        if (initcapcity < 1) throw new IllegalArgumentException("Capacity too small!");
        this.capacity = initcapcity;
        this.storage = new int[initcapcity];
        this.count = 0;
    }

    private void push(int elem) {
        if (count == capacity) expandStack();
        storage[count++] = elem;
    }

    private void expandStack() {
        storage = Arrays.copyOf(storage, EXPAND_CONST * capacity);
        capacity = capacity * EXPAND_CONST;
    }

    private int pop() {
        count--;
        if (count == -1) throw new IllegalArgumentException("Stack is empty!");
        return storage[count];
    }

    private int peek() {
        if (count == 0) throw new IllegalArgumentException("Stack is empty!");
        return storage[count - 1];
    }

    private boolean isEmpty() {
        return count == 0;
    }

    private int size() {
        return count;
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        System.out.println(myStack.peek());//8
        System.out.println(myStack.size());//8
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack.pop());
        }
        System.out.println(myStack.isEmpty());//true
        myStack.pop();
    }
}
