package com.wipro.practicecodes;
import java.util.Arrays;
import java.util.HashSet;
public class ArraySorting {
	public static void printNMinimumElements(int[] original, int N) {
        if (N > original.length) {
            System.out.println("Error: N is greater than the length of the array.");
            return;
        }

        
        int[] sortedArray = original.clone();

    
        Arrays.sort(sortedArray);

        HashSet<Integer> smallestElements = new HashSet<>();
        for (int i = 0; i < N; i++) {
            smallestElements.add(sortedArray[i]);
        }

        
        for (int num : original) {
            if (smallestElements.contains(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    
	public static void main(String[] args) 
	{
		int[] array = {5, 3, 8, 6, 2};
        int N = 3;

        printNMinimumElements(array, N);
	}

}
