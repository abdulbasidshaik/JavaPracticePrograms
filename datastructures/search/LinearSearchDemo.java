package com.wipro.datastructures.search;

public class LinearSearchDemo {
	
	public static int LinearSearch(int[] arr, int target)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if( arr[i] == target)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {5, 3, 8, 4, 2, 7, 1, 9};
		int target = 4;
		int result = LinearSearch(numbers, target);
		if(result != -1)
		{
			System.out.println("Element found at index: " + result);
		}
		else
		{
			System.out.println("Elemenet not found in the array.");
		}
		
	}

}
