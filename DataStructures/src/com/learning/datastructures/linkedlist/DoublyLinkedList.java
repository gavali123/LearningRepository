package com.learning.datastructures.linkedlist;

public class DoublyLinkedList {
	Node head;
	int count = 0;

	static class Node {
		int data;
		Node prev, next;

		public Node(int data) {
			this.data = data;
			this.prev = this.next = null;
		}
	}

	public boolean insert(int data) {
		Node node = new Node(data);
		Node currentNode = head;
		if (currentNode == null) {
			head = node;
			node.prev = head;
		} else {
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
			node.prev = currentNode;
		}
		count++;
		return true;
	}

	public boolean delete(int data) {
		boolean value = false;
		Node currentNode = head;
		if (currentNode != null && currentNode.data == data) {
			head = currentNode.next;
			value = true;
		} else {
			while (currentNode != null && currentNode.data != data) {
				currentNode = currentNode.next;
			}
			if (currentNode != null) {
				if (currentNode.next != null) {
					currentNode.next.prev = currentNode.prev;
				}
				if (currentNode.prev != null) {
					currentNode.prev.next = currentNode.next;
				}
				value = true;
			}
		}
		if (value) {
			count--;
		}
		return value;
	}
	
	public int size() {
		return count;
	}

	public void print() {
		System.out.print("\nList Elements: ");
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}
}
