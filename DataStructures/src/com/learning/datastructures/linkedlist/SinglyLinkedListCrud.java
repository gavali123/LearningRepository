package com.learning.datastructures.linkedlist;

public class SinglyLinkedListCrud {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(list, 10);
		list.insert(list, 20);
		list.insert(list, 30);
		list.insert(list, 40);
		list.insert(list, 50);
		list.insert(list, 60);
		list.insert(list, 70);
		list.insert(list, 80);
		list.insert(list, 200, 0);
		list.insert(list, 100, 3);
		list.insert(list, 500, 9);
		list.print(list);

		list.delete(list, 30);
		list.print(list);

	}
}
