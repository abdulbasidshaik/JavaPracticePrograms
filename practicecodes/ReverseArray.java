package com.wipro.practicecodes;

public class ReverseArray {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6};

        // Print the array in reverse order
        System.out.println("Array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
	}

}
