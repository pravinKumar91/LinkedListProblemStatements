package com.solutions.singlylinkedlist;

import java.util.Random;

public class SinglyLinkedList {
	
	public Node createSinglyLinkedList(int nodeCount) {
		System.out.println("Creating singly linked list :");
		Random randomValue = new Random();		
		Node node = new Node(randomValue.nextInt());
		Node head = node;
		for (int i=0;i<nodeCount-1;i++) {
			Node nextNode = new Node(randomValue.nextInt());
			node.next = nextNode;
			node = nextNode;
		}
		return head;
	}
	
	public void printSinglyLinkedList(Node head) throws Exception {
		if(head==null) {
			throw new Exception("Empty linked list.");
		}
		Node node = head;
		while(node!=null) {
			System.out.println("Next Element : " +node.value);
			node = node.next;
		}
	}
	
	public Node createLoopSinglyLinkedList(int nodeCount) {
		System.out.println("Creating singly linked list with loop :");
		Random randomValue = new Random();		
		Node node = new Node(randomValue.nextInt());
		Node head = node;
		for (int i=0;i<nodeCount-1;i++) {
			Node nextNode = new Node(randomValue.nextInt());
			node.next = nextNode;
			node = nextNode;
		}
		node.next = head;
		return head;
	}
}
