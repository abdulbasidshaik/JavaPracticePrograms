package com.wipro.datastructures.nonlinear.graphsalgo;

import java.util.Arrays;

// Class to represent a weighted edge in the graph
class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    // Comparator function used for sorting edges based on their weight
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}

// Class to represent subsets for union-find
class Subset {
    int parent, rank;
}

public class KrushkalAlgoDemo {
    private int vertices, edges;
    private Edge[] edge;

    // Constructor
    KrushkalAlgoDemo(int v, int e) {
        vertices = v;
        edges = e;
        edge = new Edge[e];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge(0, 0, 0);
    }

    // Find set of an element i (uses path compression technique)
    int find(Subset subsets[], int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    // A function that does union of two sets of x and y (uses union by rank)
    void union(Subset subsets[], int x, int y) {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);

        if (subsets[xroot].rank < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank > subsets[yroot].rank)
            subsets[yroot].parent = xroot;
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }

    // The main function to construct MST using Kruskal's algorithm
    void KruskalMST() {
        Edge result[] = new Edge[vertices]; // This will store the resultant MST
        int e = 0; // Index variable used for result[]
        int i = 0; // Index variable used for sorted edges

        // Step 1: Sort all the edges in non-decreasing order of their weight
        Arrays.sort(edge);

        // Allocate memory for creating V subsets
        Subset subsets[] = new Subset[vertices];
        for (i = 0; i < vertices; ++i)
            subsets[i] = new Subset();

        // Create V subsets with single elements
        for (int v = 0; v < vertices; ++v) {
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }

        i = 0; // Initialize index variable

        // Number of edges to be taken is equal to V-1
        while (e < vertices - 1) {
            // Step 2: Pick the smallest edge. Increment index for next iteration
            Edge next_edge = edge[i++];

            int x = find(subsets, next_edge.src);
            int y = find(subsets, next_edge.dest);

            // If including this edge does not cause a cycle, include it in the result
            if (x != y) {
                result[e++] = next_edge;
                union(subsets, x, y);
            }
            // Else discard the next_edge
        }

        // Print the edges of MST
        System.out.println("Edges of MST using Kruskal's algorithm:");
        for (i = 0; i < e; ++i)
            System.out.println(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);
    }

    // Driver method
    public static void main(String[] args) {
        int V = 9; // Number of vertices in graph
        int E = 14; // Number of edges in graph
        KrushkalAlgoDemo graph = new KrushkalAlgoDemo(V, E);

        // Adding edges with their weights
        graph.edge[0] = new Edge(0, 1, 4);
        graph.edge[1] = new Edge(0, 7, 8);
        graph.edge[2] = new Edge(1, 2, 8);
        graph.edge[3] = new Edge(1, 7, 11);
        graph.edge[4] = new Edge(2, 3, 7);
        graph.edge[5] = new Edge(2, 5, 4);
        graph.edge[6] = new Edge(2, 8, 2);
        graph.edge[7] = new Edge(3, 4, 9);
        graph.edge[8] = new Edge(3, 5, 14);
        graph.edge[9] = new Edge(4, 5, 10);
        graph.edge[10] = new Edge(5, 6, 2);
        graph.edge[11] = new Edge(6, 7, 1);
        graph.edge[12] = new Edge(6, 8, 6);
        graph.edge[13] = new Edge(7, 8, 7);

        // Apply Kruskal's algorithm
        graph.KruskalMST();
    }
}
