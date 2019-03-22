package com.learning.datastructures.linkedlist;

public class LinkedList {
	Node head;
	int size = 0;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public int size() {
		return size;
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
		size++;
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
			while (currentNode != null && counter != position) {
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
		if (value) {
			size++;
		}
		return value;
	}

	public int get(int index) {
		Node currentNode = head;
		int iterator = 0;
		if (currentNode != null && index == 0) {
			return currentNode.data;
		} else {
			while (currentNode != null && iterator++ != index) {
				currentNode = currentNode.next;
			}
			if (currentNode != null) {
				return currentNode.data;
			}
		}
		return 0;
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
		if (value) {
			size--;
		}
		return value;
	}

	public void printreverse() {
		int count = size - 1;
		while (count >= 0) {
			System.out.print(get(count--) + " ");
		}
	}

	public Node reverse() {
		Node currentNode = head, prevNode = null, nextNode = null;
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		return prevNode;
	}

	public void print() {
		Node node = head;
		System.out.print("\nLinkedList: ");
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public void print(Node node) {
		System.out.print("\nLinkedList: ");
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}
