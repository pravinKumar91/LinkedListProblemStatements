package com.solutions.singlylinkedlist;

public class FindMiddleElementInOneParse {	
	protected void findMiddleElementInOneParse(Node head) throws Exception {
		if(head==null) {
			throw new Exception("Empty Linked List");
		}
		//declare turtle pointer to jump one node forward
		//declare rabbit pointer to jump twice node forward
		Node nodeTurtle = head;
		Node nodeRabbit = head;
		while(nodeTurtle.next!=null && (nodeRabbit.next!=null)) {
			if(nodeRabbit.next.next!=null) {
				nodeRabbit = nodeRabbit.next.next;
			} else {
				break;
			}
			nodeTurtle = nodeTurtle.next;
		} 
		if(nodeRabbit.next==null) {
			//found middle element
			System.out.println("Linked list is odd in count.");
			System.out.println("Middle Element value : "+nodeTurtle.value);
		} else if(nodeRabbit.next.next==null) {
			//found two middle elements, linked list is even in numbers.
			System.out.println("Linked list is even in count.");
			System.out.println("Middle Element first value : "+nodeTurtle.value);
			System.out.println("Middle Element Second value : "+nodeTurtle.next.value);
		}
	}
}
