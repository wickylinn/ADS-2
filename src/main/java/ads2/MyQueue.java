package com.example.ads2;

public class MyQueue<T> {
    private MyLinkedList<T> queue;

    public MyQueue() {
        queue = new MyLinkedList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
    } // Add an item to the end of the queue

    public T dequeue() { //Remove and return the item from the beginning of the queue
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        T item = queue.get(0);
        queue.remove(0);
        return item;
    }
    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public int size() {
        return queue.size();
    }
}