package com.example.ads2;

public class MyStack<T> {
    private MyArrayList<T> stack;

    public MyStack() {
        stack = new MyArrayList<>();
    }

    public void push(T item) { //Add an item to the top of the stack
        stack.add(item);
    }

    public T pop() { //Remove and return the last item from the stack
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        T item = stack.get(stack.size() - 1); //Get the last element
        stack.remove(stack.size() - 1); //Remove the last element
        return item;
    }

    public boolean isEmpty() { //Check if the stack is empty
        return stack.size() == 0;
    }

    public int size() { //Return the number of elements in the stack
        return stack.size();
    }
}