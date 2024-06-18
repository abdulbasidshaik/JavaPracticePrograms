package com.wipro.practicecodes;

import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = sumArray(numbers, numbers.length);
        System.out.println("The sum of the array elements is: " + sum);
    }

 
    public static int sumArray(int[] array, int n) {
        if (n == 0) {
            return 0;
        }
        return sumArray(array, n - 1) + array[n - 1];
    }
}
