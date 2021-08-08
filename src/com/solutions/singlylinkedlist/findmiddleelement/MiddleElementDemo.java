package com.solutions.singlylinkedlist.findmiddleelement;

import com.solutions.singlylinkedlist.Node;
import com.solutions.singlylinkedlist.SinglyLinkedList;

public class MiddleElementDemo {
	
	public static void main(String[] args) {
		SinglyLinkedList obj = new SinglyLinkedList();
		Node head = obj.createSinglyLinkedList(9);
		try {
			obj.printSinglyLinkedList(head);
			
			FindMiddleElementInOneParse objNew = new FindMiddleElementInOneParse();
			objNew.findMiddleElementInOneParse(head);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
