package com.wipro.practicecodes;

public class SumArray {
	    public static void main(String[] args) {
	        int count = 0;  // Initialize sum variable correctly
	        int arr[] = {3, 4, 6, 2, 7, 8, 9};  // Correct syntax to initialize an array

	        for (int i = 0; i < arr.length; i++) {
	            count += arr[i];  // Sum up array elements using 'i' to index the array
	        }

	        System.out.println("Sum of all elements of array is: " + count);
	    }
}
