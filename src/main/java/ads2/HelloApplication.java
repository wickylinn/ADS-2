package com.example.ads2;

public class HelloApplication {
    public static void main(String[] args) {
        MyArrayList list1 = new MyArrayList(); //Testing MyArrayList and MyLinkedList methods
        list1.add("Pig");
        list1.add(2);
        list1.add("Dog");
        list1.add("Cat");
        list1.add("5");
        list1.add("Cow");
        System.out.println(list1.size());
        System.out.println(list1.get(0));
        list1.remove(0);
        System.out.println(list1.get(0));  //Deleted Pig from the array, after that the int 2 is assigned to the 0 index
        list1.clear();
        System.out.println(list1.size());
        System.out.println("Tested all methods of MyArrayList");
        MyLinkedList list2 = new MyLinkedList();
        list2.add("Pig");
        list2.add(2);
        list2.add("Dog");
        list2.add("Cat");
        list2.add("5");
        list2.add("Cow");
        System.out.println(list2.size());
        System.out.println(list2.get(0));
        list2.remove(0);
        System.out.println(list2.get(0));
        list2.clear();
        System.out.println(list2.size());
        System.out.println("Tested all methods of MyLinkedList");
    }
}