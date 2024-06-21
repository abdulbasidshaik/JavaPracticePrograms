package com.wipro.datastructures.nonlinear;

import java.util.Objects;

public class Product {
	private String name;
	private double price;
	
	//parameterized constructor
	public Product(String name, double price)
	{
		super();
		this.name = name;
		this.price = price;
	}
	
	//setters and getters
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setprice(double price)
	{
		this.price = price;
	}
	
	@Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + '}';
    }

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Product product = (Product) obj;
		return Objects.equals(name, product.name);
	}
}
