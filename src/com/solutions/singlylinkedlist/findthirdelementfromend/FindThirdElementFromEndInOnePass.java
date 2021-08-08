package com.solutions.singlylinkedlist.findthirdelementfromend;

import com.solutions.singlylinkedlist.Node;

public class FindThirdElementFromEndInOnePass {	
	
	protected void findThirdElementFromEndInOneParse(Node head) throws Exception {
		if(head==null) {
			throw new Exception("Empty Linked List");
		}
		//declare turtle pointer to jump one node forward
		//declare rabbit pointer to jump twice node forward
		Node nodeTurtle = head;
		Node nodeRabbit = head;
		Node thirdElementFromEnd = null;
		while(nodeTurtle.next!=null && (nodeRabbit.next!=null)) {
			if(nodeRabbit.next.next!=null) {
				thirdElementFromEnd = nodeRabbit;
				nodeRabbit = nodeRabbit.next.next;
			} else {
				break;
			}
			nodeTurtle = nodeTurtle.next;
		}
		if(thirdElementFromEnd!=null) {
			System.out.println("Found third element from last :"+thirdElementFromEnd.value);			
		} else {
			System.out.println("Linked List does not have more than 3 elemets.");
		}
	}
}
