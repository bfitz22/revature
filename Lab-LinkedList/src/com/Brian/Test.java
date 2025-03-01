package com.Brian;

public class Test {
	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
		Node newNode = new Node(1);
		Node newNode1 = new Node(1);
		Node newNode2 = new Node(2);
		Node newNode3 = new Node(3);
		Node newNode4 = new Node(3);
		
//		list.add(newNode);
//		list.add(newNode1);
//		list.add(newNode2);
//		list.add(newNode3);
//		list.add(newNode4);	
//		
//		System.out.println(list);
//		
//		removeDuplicates(list);
//		
//		System.out.println(list);
		
		Stack stack = new Stack();
		stack.push(newNode);
		stack.push(newNode1);
		stack.push(newNode2);
		stack.push(newNode3);
		stack.push(newNode4);
		
		stack.pop();
		
		System.out.println(stack.peek() == newNode3);
		System.out.println(stack.peek().next == newNode2);
	}
	
	public static void removeDuplicates(LinkedList list) {
		Node current = list.head; 
		Node runner = null; 
		
		while (current != null) {
			runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
}
