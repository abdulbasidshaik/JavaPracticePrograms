package com.wipro.datastructures;

class LinkedList
{
	//head of the list
	Node head;
	
	//Linked List Node
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	//Method to insert new node
	public static LinkedList insert(LinkedList list, int data)
	{
		//creating a new node with given data
		Node new_node = new Node(data);
		
		//if list is empty then we make new node as head
		if(list.head == null)
		{
			list.head = new_node;
		}
		else
		{
			//traverse till last node and insert new node
			Node last = list.head;
			while(last.next != null)
			{
				last = last.next;
			}
			//insert new node at last node
			last.next = new_node;
		}
		//return the list at last node
		return list;
	}
	
}
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
