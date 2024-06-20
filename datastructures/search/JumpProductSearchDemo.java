package com.wipro.datastructures.search;

public class JumpProductSearchDemo {
	
	public static Product jumpSearch(Product[] products, int targetId) {
        int n = products.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (products[Math.min(step, n) - 1].getId() < targetId) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return null;
            }
        }

        while (products[prev].getId() < targetId) {
            prev++;
            if (prev == Math.min(step, n)) {
                return null;
            }
        }

        if (products[prev].getId() == targetId) {
            return products[prev];
        }

        return null; 
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
		 Product[] products = {
				 new Product(1, "Laptop", 77000),
		            new Product(2, "Smartphone", 49000),
		            new Product(3, "Tab", 30000),
		            new Product(4, "Buds", 3000),
		            new Product(5, "Tv", 43000)
		 };
 
		 int targetId = 1;
		 Product result = jumpSearch(products, targetId);

		 if (result != null) 
		 {
			 System.out.println("Product found: " + result);
		 } 
		 else 
		 {
			 System.out.println("Product with ID " + targetId + " not found.");
		 }
    }
}
