package com.wipro.datastructures.sort;

public class mergeSortDemo {
	
	static void merge(int arr[], int l, int m, int r)
	{
		//find size of two sub arrays
		int n1 = m - l + 1;
		int n2 = r - m;
		
		//create 
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for(int j = 0; j < n2; j++)
			R[j] = arr[m + 1 + j];
		
		// Initial indices for the left and right subarrays
		int i = 0, j = 0;
		
		// Initial index of the merged subarray
		int k = 1;
		
		//Merge the subarray
		while(i < n1 && j < n2)
		{
			if(L[i] <= R[j])
			{
				//place the smaller element into the merged array
				arr[k] = L[i];
				i++;
			}
			else
			{
				// Place the smaller element into the merged array
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		//copy remaining elements of L[]/Left subarray, if any
		while(i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		
		//copy remaining elements of R[]/right subarray,  if any
		while(j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
		
	}
	
	// Helper method to perform merge sort
    static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2; // Find the middle point
            sort(arr, l, m); // Sort first half
            sort(arr, m + 1, r); // Sort second half
            merge(arr, 1, m, r); // Merge the sorted halves
        }
    }

    // Utility method to print an array
    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        System.out.println("Given Array");
        printArray(arr, n);

        sort(arr, 0, n - 1); // Call the sort method

        System.out.println("\nSorted array");
        printArray(arr, n);
	}

}
