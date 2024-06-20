package com.wipro.datastructures.search;

public class BinaryProductSearchDemo {
	public static int BinearSearchById(Product[] products, int id) {
		int low = 0;
        int high = products.length - 1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if (products[mid].getId() == id) 
            {
                return mid;
            }
            if (products[mid].getId() < id) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }
        return -1;
    }


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Product[] products = {
				new Product(1,"Laptop",89000.00),
				new Product(2,"Desktop",45000.00),
				new Product(3,"Tv",80000.00),
				new Product(4,"AC",75000.00),
				new Product(5,"Phone",55000.00),
		};
		int searchid=4;
		int result = BinearSearchById(products,searchid);
		if(result==-1) 
		{
			System.out.println("Element not found in array");
		}
		else 
		{
			System.out.println("Element is present at index: "+result);
		}
		
	}
}
