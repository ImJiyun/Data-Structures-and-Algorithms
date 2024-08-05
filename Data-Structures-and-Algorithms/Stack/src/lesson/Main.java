package lesson;

public class Main {
    public static void main(String[] args) {

        // stack is an abstract data type
        // it's backed by an array, linked list(an ideal type)
        // 1. arrays are great for random access, stacks aren't
        // we only work with the top item of a stack.
        // 2. Arrays are a fixed size, if we try to push something onto the stack
        // when array is full, it's not going to work

        // if an array doesn't have to be resized frequently,
        // using an array is a good choice

        // if an array change its size frequently,
        // and memory is tight so we don't want a lot of wasted space in the backing array
        // array is not a good choice
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        // stack.printStack();

        System.out.println(stack.peek());
        // stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());

    }
}