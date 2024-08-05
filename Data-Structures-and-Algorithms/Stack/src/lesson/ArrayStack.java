package lesson;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    // capacity is the maximum number of items can be stored on the stack
    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        // if the stack is full
        if (top == stack.length) {
            // need to resize the backing array
            Employee[] newArray = new Employee[2 * stack.length];
            // copy original array -> time complexity 0(n)
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee; // -> time complexity 0(1)
    }

    public Employee pop() {
        // if stack is empty,
        if (isEmpty()) {
            // throw exception
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek() {
        // if stack is empty,
        if (isEmpty()) {
            // throw exception
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0; // if top is 0, then the stack is empty
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
