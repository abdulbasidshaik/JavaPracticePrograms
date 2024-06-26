package com.wipro.datastructures.nonlinear;

import java.util.ArrayList;
import java.util.LinkedList;

class Graph {
    private int vertices;
    private ArrayList<LinkedList<Integer>> adjList;

    // Constructor to initialize the graph
    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    // Method to add an edge to the graph
    void addEdge(int v, int w) {
        adjList.get(v).add(w);
    }

    // Method to print the graph
    void printGraph() {
        for (int i = 0; i < vertices; ++i) {
            System.out.print("Vertex " + i + ":");
            for (Integer vertex : adjList.get(i)) {
                System.out.print(" -> " + vertex);
            }
            System.out.println();
        }
    }
}

public class Test19 {
    public static void main(String[] args) {
        int v = 5;
        Graph g = new Graph(v);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}
