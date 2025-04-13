package com.example.ads2;

public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap;

    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    public void add(T item) {
        heap.add(item);
        heapifyUp(heap.size() - 1); //Adjust the heap from the added item
    }

    public T extractMin() { //Extract the minimum item (root) from the heap
        T min = heap.get(0); //The minimum is always at the 0 index
        T last = heap.get(heap.size() - 1); //Get the last element
        heap.remove(heap.size() - 1); //Remove the last element from the heap
        if (!isEmpty()) {
            heap.set(0, last); //Move the last element to the beginning
            heapifyDown(0); //Adjust the heap down to restore min-heap property
        }
        return min;
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public int size() {
        return heap.size();
    }

    private void heapifyUp(int index) { //Reorganize the heap from bottom to top
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parent)) < 0) { // If the current item is smaller than the parent, swap them
                swap(index, parent);
                index = parent;
            } else break;
        }
    }

    private void heapifyDown(int index) { // Reorganize the heap from top to bottom
        int size = heap.size();
        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && heap.get(left).compareTo(heap.get(smallest)) < 0) {
                smallest = left;
            }
            if (right < size && heap.get(right).compareTo(heap.get(smallest)) < 0) {
                smallest = right;
            }

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else break;
        }
    }

    private void swap(int i, int j) { // Swap two elements in the heap
        T tmp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, tmp);
    }
}