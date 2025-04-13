package com.example.ads2;

public class MyArrayList<T> implements MyList<T>{
    private Object[] elements;
    private int lenght;

    public MyArrayList() {
        elements = new Object[5]; //start with small fixed size
        lenght = 0;
    }

    public void add(T item){ //Adds a new item to the end of the list
        if(lenght == elements.length){
            increaseBuffer(); // if full, double the size
        }
        elements[lenght++] = item; //upcasting
    }

    private void increaseBuffer() {  //Increases the size of array when it's full
        Object[] newElements = new Object[lenght*2];
        for(int i = 0; i < elements.length; i++){
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public int size(){
        return lenght;
    }

    public T get(int index){
        checkIndex(index);
        return (T) elements[index];  //downcasting
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= lenght){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + lenght);
        }
    }

    public void clear(){
        elements = new Object[5];
        lenght = 0;
    }
    public void set(int index, T value) {
        checkIndex(index);
        elements[index] = value;
    }
    public void remove(int index){
        checkIndex(index);
        for(int i = index; i < lenght - 1; i++){
            elements[i] = elements[i+1];
        }
        lenght--;
    }
}
