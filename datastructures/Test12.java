package com.wipro.datastructures;

class Node
{
	int key;
	Node prev;
	Node next;
	Node()
	{
		prev = null;
		next = null;
	}
}

class DoublyLinkedList
{
	static Node head = null;
	static Node first = null;
	static Node tail = null;
	static Node temp = null;
	static int i = 0;
	
	//Add a Node
	static void addNode(int k)
	{
		Node ptr = new Node();
		
		//assign key
		ptr.key = k;
		
		//next and prev ptr to null
		ptr.next = null;
		ptr.prev = null;
		
		if(head == null)
		{
			head = ptr;
			first = head;
			tail = head;
		}
		else //insert at the end of the linkedlist
		{
			temp = ptr;
			first.next = temp;
			temp.prev = first;
			first = temp;
			tail = temp;
		}
		i++;
	}
	
	// Traverse the list and print the keys
    static void traverse() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.key + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }
    
    static void inserAtBeginning(int k)
    {
    	Node ptr = new Node();
    	ptr.key = k;
    	ptr.next = null;
    	ptr.prev = null;
    	
    	if(head == null)
    	{
    		first = ptr;
    		first = head;
    		tail = head;
    	}
    	else  //inser node at beginning and 
    	{  //change the head to current node
    		temp = ptr;
    		temp.next = head;
    		head.prev = temp;
    		head = temp;
    	}
    }

 // Insert a node at the end
    static void insertAtEnd(int k) {
        Node ptr = new Node();
        ptr.key = k;

        if (tail == null) {
            head = ptr;
            tail = head;
        } else {
            tail.next = ptr;
            ptr.prev = tail;
            tail = ptr;
        }
    }
}
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll = new DoublyLinkedList();

        // Adding nodes to the list
        dll.addNode(10);
        dll.addNode(20);
        dll.addNode(30);
        dll.addNode(40);
        dll.addNode(50);
        dll.addNode(60);
        dll.addNode(70);
        dll.addNode(80);
        dll.addNode(90);
        dll.addNode(100);
        
        //Traverse and display the list
        dll.traverse();
        
        dll.inserAtBeginning(110);
        
        dll.traverse();

	}
}
