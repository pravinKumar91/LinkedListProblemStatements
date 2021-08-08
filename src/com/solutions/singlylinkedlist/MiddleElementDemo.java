package com.solutions.singlylinkedlist;

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
