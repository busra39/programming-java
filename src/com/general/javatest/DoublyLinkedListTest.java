package com.general.javatest;

public class DoublyLinkedListTest {
    public static void main(String... args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        // NO such element error
        list.removeLast(2);
        list.removeFirst(34);

        // Index out of bounds error
        list.removeAt(5);

        // []
        list.display();

        list.addFirst(23);
        list.addFirst(12);
        list.addFirst(56);
        list.addFirst(67);
        list.addLast(88);
        list.addLast(12);
        list.addLast(77);
        list.addLast(99);
        list.display(); // [67, 56, 12, 23, 88, 12, 77, 99]

        list.removeAt(3);
        list.display(); // [67, 56, 12, 88, 12, 77, 99]

        list.removeFirst(12);
        list.display();  // [67, 56, 88, 12, 77, 99]
        list.addFirst(77);
        list.removeLast(77);
        list.display(); /// [77, 67, 56, 88, 12, 99]
    }
}
