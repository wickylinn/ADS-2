package com.example.ads2;

public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private int length;

    public class MyNode<E> {
        E data;
        MyNode<E> next;

        public MyNode(E data) {
            this.data = data;
        }
    }
    public MyLinkedList() {
        head = null;
        length = 0;
    }
    @Override
    public void add(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if(head == null){
            head = newNode;
        }
        else {
            MyNode<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            MyNode<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        length--;
    }
    @Override
    public void clear() {
        head = null;
        length = 0;
    }

    @Override
    public T get(int index) {
        MyNode<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }
}