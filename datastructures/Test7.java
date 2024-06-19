package com.wipro.datastructures;

class Queue
{
	static private int front, rear, capacity;
	static private int queue[];
	
	Queue(int c)
	{
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}
	
	//function to insert an element
	static void queueEnque(int data)
	{
		if(capacity == rear)
		{
			System.out.println("\n Queue is Full");
		}
		else
		{
			queue[rear] = data;
			rear++;
		}
		return;
	}
	
	//function to delete an element
	static void queueDeque()
	{
		if(capacity == rear)
		{
			System.out.println("\n Queue is Full");
		}
		else
		{
			//shift all the elements from index 2 till rear to the right by one
			for(int i=0;i<rear-1; i++)
			{
				queue[i] = queue[i +1];
			}
			
			//store 0 at rear indicating their is no element
			if(rear < capacity)
			{
				queue[rear] = 0;
				
				//decr rear
				rear--;
			}
		}
	}

	//print queue
	static void queueDisplay()
	{
		if(front == rear)
		{
			System.out.println("\n Queue is Empty");
			return;
		}
		else {
            System.out.print("\nQueue Elements are: ");
            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
	}
	
	 // Print front element of the queue
	static void dequeueFront()
	{
		if(front == rear)
		{
			System.out.println("\n Queue is Empty");
			return;
		}
		else
		{
			System.out.println("\n Front Element is: %d" + queue[front]);
		}
		
	}
}

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		q.queueEnque(10);
		q.queueEnque(20);
		q.queueEnque(30);
		q.queueEnque(40);
		q.queueEnque(50);
		//System.out.println("Queue Elements are: ");
		
		q.queueDisplay();
		q.queueEnque(60);
		q.queueDeque();
		
		q.queueDisplay();

	}

}
