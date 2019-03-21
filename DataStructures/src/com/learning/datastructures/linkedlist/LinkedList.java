package com.learning.datastructures.linkedlist;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public boolean insert(LinkedList list, int data) {
		LinkedList.Node node = new LinkedList.Node(data);
		if (list.head == null) {
			list.head = node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
		}
		return true;
	}
	
	public boolean insert(LinkedList list, int data, int position) {
		boolean value = false;
		LinkedList.Node node = new LinkedList.Node(data);
		Node currentNode = list.head, prevNode = null;
		if (currentNode != null && position == 0) {
			list.head = node;
			node.next = currentNode;
			value = true;
		} else {
			int counter = 0;
			while(currentNode != null && counter != position) {
				counter++;
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
			if (currentNode != null) {
				prevNode.next = node;
				node.next = currentNode;
				value = true;
			}
		}
		return value;
	}

	public boolean delete(LinkedList list, int key) {
		Node currentNode = list.head, prevNode = null;
		boolean value = false;
		if (currentNode != null && currentNode.data == key) {
			value = true;
			list.head = currentNode.next;
		} else {
			while (currentNode != null && currentNode.data != key) {
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
			if (currentNode != null) {
				value = true;
				prevNode.next = currentNode.next;
			}
		}
		return value;
	}

	public void print(LinkedList list) {
		Node node = list.head;
		System.out.print("\nLinkedList: ");
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}
