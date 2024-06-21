package com.wipro.datastructures.nonlinear;

import java.util.List;
import java.util.ArrayList;

class Edge
{
	private Product start;
	private Product end;
	private String type;
	
	//parameterized constructor
	public Edge(Product start, Product end, String type)
	{
		super();
		this.start = start;
		this.end = end;
		this.type = type;
	}

	//getter and setter
	public Product getStart() {
		return start;
	}

	public void setStart(Product start) {
		this.start = start;
	}

	public Product getEnd() {
		return end;
	}

	public void setEnd(Product end) {
		this.end = end;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString()
	{
		return "Edge{start=" + start + ", end=" + end + ", type=' " + type + "'}";
	}
}


class ProductGraph
{
	private List<Product> products;
	private List<Edge> edges;
	
	public ProductGraph()
	{
		this.products = new ArrayList<>();
		this.edges = new ArrayList<>();
	}
	
	//Getters
	public List<Product> getProducts()
	{
		return products;
	}
	
	public List<Edge> getEdges()
	{
		return edges;
	}
	
	public void addProduct(Product product)
	{
		products.add(product);
	}
	
	public void addEdge(Product start, Product end, String type)
	{
		Edge edge = new Edge(start, end, type);
		edges.add(edge);
		
		//Assuming graph is undirected, so we add edges in both directions
		edges.add(new Edge(end, start, type));
	}
	
	// Method to print graph details
    public void printGraph() {
        System.out.println("Products in the graph:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("\nEdges in the graph:");
        for (Edge edge : edges) {
            System.out.println(edge);
        }
    }
}

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating Product instances
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Desktop", 50000);
        Product p3 = new Product("Tab", 15000);

        // Creating ProductGraph instance
        ProductGraph graph = new ProductGraph();

        // Adding products to the graph
        graph.addProduct(p1);
        graph.addProduct(p2);
        graph.addProduct(p3);

        // Adding edges between products
        graph.addEdge(p1, p2, "Related");
        graph.addEdge(p2, p3, "Related");

        // Printing the graph
        graph.printGraph();
    }
}
