package com.practice.datastructures;

public class SinglyLinkedList {
	private ListNode head;
	
	private static class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		
		ListNode current = head;
		
		while(current != null) {
			System.out.println(current.data +"--> ");
			
			current = current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.head = new ListNode(10);
		
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(15);
		ListNode fourth = new ListNode(20);
		
		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;
		
		linkedList.display();
		
	}

}
