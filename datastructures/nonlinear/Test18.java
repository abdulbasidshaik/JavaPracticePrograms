package com.wipro.datastructures.nonlinear;

import java.util.ArrayList;
import java.util.*;

class GraphDemo
{
	private Map<String, List<String>> adjList;

	//constructor
    public GraphDemo() {
        adjList = new HashMap<>();
    }
    
	// Method to Add a vertex
    public void addVertex(String label) {
        adjList.putIfAbsent(label, new ArrayList<>());
    }
    
    // Method to Add an edge
    public void addEdge(String source, String destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // Since this is an undirected graph
    }
    
	// Method to print the graph
    public void printGraph() {
        for (String vertex : adjList.keySet()) {
            System.out.print(vertex + ": ");
            for (String neighbor : adjList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
	
}
public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphDemo graph = new GraphDemo(); // Create a new graph object
		
		 // Add vertices to the graph
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		
		 // Add edges between vertices
		graph.addEdge("A", "B");
		graph.addEdge("A", "C");
		
		// Print the graph's adjacency list representation
		System.out.println("Graph representation:");
		graph.printGraph();
		
		
	}

}
