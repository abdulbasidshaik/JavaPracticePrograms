package com.wipro.practicecodes;

public class PerformLinearSearch {
	    public static int linearSearch(int[] array, int x) {
	        int n = array.length;
	        for (int i = 0; i  <  n; i++) {
	            if (array[i] == x) {
	                return i; // Return the index where the element is found
	            }
	        }
	        return -1; // Element not found
	    }

	    public static void main(String args[]) {
	        int[] a = {2, 4, 5, 8, 0, 1, 9};
	        int x = 8;
	        int result = linearSearch(a, x);

	        if (result == -1) {
	            System.out.print("Element not found");
	        } else {
	            System.out.print("Element found at index: " + result);
	        }
	    }
}
