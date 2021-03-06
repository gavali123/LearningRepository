package com.learning.datastructures.linkedlist;

import com.learning.datastructures.linkedlist.LinkedList.Node;

public class LinkedListCrud {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(list, 10);
		list.insert(list, 20);
		list.insert(list, 30);
		list.insert(list, 40);
		list.print();

		list.insert(list, 200, 0);
		list.print();

		System.out.println("\nAfter Delete");
		list.delete(list, 30);
		list.print();

		System.out.println("\nSize: " + list.size());

		System.out.println("\nPrinting Reverse List: ");
		list.printreverse();

		Node reverseList = list.reverse();
		System.out.println("\nReverse List: ");
		list.print(reverseList);

		System.out.println("\nDoubly Linked List: ");
		// Doubly Linked List
		DoublyLinkedList doublyList = new DoublyLinkedList();
		doublyList.insert(10);
		doublyList.insert(20);
		doublyList.insert(30);
		doublyList.insert(40);
		doublyList.print();
		System.out.println("\nSize : " + doublyList.size());

		System.out.println("\nAfter Delete");

		doublyList.delete(40);
		doublyList.print();
		System.out.println("\nSize : " + doublyList.size());

	}
}
