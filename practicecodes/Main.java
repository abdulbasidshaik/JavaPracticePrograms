package com.wipro.practicecodes;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Reading the size of the array
		int N = scanner.nextInt();
		scanner.nextLine(); // consume newline
		        
		// Reading the array elements
		int[] array = new int[N];
		for (int i = 0; i < N; i++) 
		{
			array[i] = scanner.nextInt();
		}
		        
		// Reading the number of smallest elements to find
		int n = scanner.nextInt();
		        
		// Define an array of indexes from 0 to N-1
		Integer[] indices = new Integer[N];
		for (int i = 0; i < N; i++) 
		{
			indices[i] = i;
		}
		        
		// Sort indices based on the values in the array
		Arrays.sort(indices, Comparator.comparingInt(i -> array[i]));
		        
		// Determine the indices of the n smallest elements
		boolean[] smallestIndices = new boolean[N];
		for (int i = 0; i < n; i++) 
		{
			smallestIndices[indices[i]] = true;
		}
		        
		// Output the n smallest elements in their original order
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < N; i++) 
		{
			if (smallestIndices[i]) 
			{
				result.add(array[i]);
		    }
		}
		        
		        // Print the result
		for (int i = 0; i < result.size(); i++) 
		{
		   if (i > 0) System.out.print(" ");
		       System.out.print(result.get(i));
		}
	}
}
