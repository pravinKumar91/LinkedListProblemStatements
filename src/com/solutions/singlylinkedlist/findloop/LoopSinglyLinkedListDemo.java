package com.solutions.singlylinkedlist.findloop;

import com.solutions.singlylinkedlist.Node;
import com.solutions.singlylinkedlist.SinglyLinkedList;

public class LoopSinglyLinkedListDemo {

	public static void main(String[] args) {
		
		SinglyLinkedList obj = new SinglyLinkedList();
		Node head = obj.createLoopSinglyLinkedList(10);
//		Node head = obj.createSinglyLinkedList(10);
		try {			
			FIndLoopInTheLinkedList objNew = new FIndLoopInTheLinkedList();
			objNew.findLoopInOneParse(head);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
