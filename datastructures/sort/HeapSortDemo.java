package com.wipro.datastructures.sort;

public class HeapSortDemo {
	
	
	static void heapSort(int arr[])
	{
		int N = arr.length;
		
		// Build heap (rearrange array)
		for(int i = N/2 - 1; i >= 0; i--)
		{
			heapify(arr, N, i);
		}
		
		// One by one extract an element from heap
		for(int i = N - 1; i > 0; i--)
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}
	
	private static void heapify(int[] arr, int N, int i)
	{
		// Initialize largest as root
		int largest = i;
		int l = 2 * i + 1;  // left = 2*i + 1
		int r = 2 * i + 2;  // right = 2*i + 2
		
		// If left child is larger than root
		if( l < N && arr[l] > arr[largest])
			largest = l;
		
		 // If right child is larger than largest so far
		if( r < N && arr[r] > arr[largest])
			largest = r;
		
		// If largest is not root
		if( largest != i)
		{
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			 // Recursively heapify the affected sub-tree
			heapify(arr, N, largest);
		}
	}
	
	// A utility function to print array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	//Driver program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 13, 12, 14, 6, 7, 8 };

		System.out.println("Original array:");
		printArray(arr);
        //HeapSortDemo ob = new HeapSortDemo();
        //ob.heapSort(arr);

		heapSort(arr);
		
        System.out.println("\nSorted array is: ");
        printArray(arr);
	}

}
