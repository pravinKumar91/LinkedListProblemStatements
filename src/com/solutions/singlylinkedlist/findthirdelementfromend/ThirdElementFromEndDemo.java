package com.solutions.singlylinkedlist.findthirdelementfromend;

import com.solutions.singlylinkedlist.Node;
import com.solutions.singlylinkedlist.SinglyLinkedList;

public class ThirdElementFromEndDemo {

	public static void main(String[] args) {
		SinglyLinkedList obj = new SinglyLinkedList();
		Node head = obj.createSinglyLinkedList(2);
		try {
			obj.printSinglyLinkedList(head);
			FindThirdElementFromEndInOnePass objNew = new FindThirdElementFromEndInOnePass();
			objNew.findThirdElementFromEndInOneParse(head);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
