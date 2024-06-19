package com.wipro.datastructures;


class Stack
{
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	
	boolean isEmpty()
	{
		return (top < 0);
	}
	
	Stack()
	{
		top = -1;
	}
	
	boolean push(int x)
	{
		if(top >= (MAX-1))
		{
			System.out.println("Stack overriew");
			return false;
		
		}
		else
		{
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		
		}
	}
	
	int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }
	
	int peek() {
        if (top < 0) {
            System.out.println("Stack is underflow..");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }
	
	void print()
	{
		for(int i = top; i > -1; i--)
		{
			System.out.println(" "+a[i]);
		}
	}
}
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack s = new Stack();
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        s.push(40);
	        s.push(50);
	        s.push(60);
	        s.push(70);
	        s.push(80);
	        s.push(90);
	        System.out.println(s.pop() + " Popped from stack");
	}

}
