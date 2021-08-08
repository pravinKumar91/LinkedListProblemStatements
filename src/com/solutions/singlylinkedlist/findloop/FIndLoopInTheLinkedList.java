package com.solutions.singlylinkedlist.findloop;

import com.solutions.singlylinkedlist.Node;

public class FIndLoopInTheLinkedList {	
	
	protected void findLoopInOneParse(Node head) throws Exception {
		if(head==null) {
			throw new Exception("Empty Linked List");
		}
		//declare turtle pointer to jump one node forward
		//declare rabbit pointer to jump twice node forward
		Node nodeTurtle = head;
		Node nodeRabbit = head;
		
		if(nodeTurtle.next==nodeRabbit) {
			System.out.println("Found Loop in the Linked List.");
		} else {
			while(nodeTurtle.next!=null && (nodeRabbit.next!=null)) {
				if(nodeRabbit.next.next!=null) {
					nodeRabbit = nodeRabbit.next.next;
				} else {
					break;
				}
				if(nodeTurtle.equals(nodeRabbit)) {
					System.out.println("Found Loop in the Linked List.");
					break;
				}
				nodeTurtle = nodeTurtle.next;
			}
		}
		System.out.println("No Loop in the Singly Linked List.");
}}
