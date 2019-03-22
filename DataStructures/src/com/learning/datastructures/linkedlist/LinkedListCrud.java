package com.learning.datastructures.linkedlist;

public class LinkedListCrud {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(list, 10);
		list.insert(list, 20);
		list.insert(list, 30);
		list.insert(list, 40);
		list.print(list);
		
		list.insert(list, 200, 0);
		list.print(list);

		System.out.println("\nAfter Delete");
		list.delete(list, 30);
		list.print(list);
		
		System.out.println("\nDoubly Linked List: ");
		//Doubly Linked List
		DoublyLinkedList doublyList = new DoublyLinkedList();
		doublyList.insert(10);
		doublyList.insert(20);
		doublyList.insert(30);
		doublyList.insert(40);
		doublyList.print();
		System.out.println("\nSize : "+doublyList.size());
		
		System.out.println("\nAfter Delete");
		
		doublyList.delete(40);
		doublyList.print();
		System.out.println("\nSize : "+doublyList.size());


	}
}
