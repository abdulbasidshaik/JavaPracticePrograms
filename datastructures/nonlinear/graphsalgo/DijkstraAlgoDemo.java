package com.wipro.datastructures.nonlinear.graphsalgo;

import java.util.*;

public class DijkstraAlgoDemo {
	 public static Map<Character, Integer> dijkstra(Map<Character, Map<Character, Integer>> graph, char start) {
	        
	        Map<Character, Integer> distances = new HashMap<>();
	        for (char vertex : graph.keySet()) {
	            distances.put(vertex, Integer.MAX_VALUE);         }
	        distances.put(start, 0); 
	        

	        PriorityQueue<Character> pq = new PriorityQueue<>(Comparator.comparingInt(distances::get));
	        pq.add(start);
	        
	        while (!pq.isEmpty()) {
	            char currentVertex = pq.poll();
	            
	            
	            for (Map.Entry<Character, Integer> neighborEntry : graph.getOrDefault(currentVertex, new HashMap<>()).entrySet()) {
	                char neighbor = neighborEntry.getKey();
	                int weight = neighborEntry.getValue();
	                
	             
	                int distance = distances.get(currentVertex) + weight;
	                
	    
	                if (distance < distances.get(neighbor)) {
	                    distances.put(neighbor, distance);
	                    pq.add(neighbor);
	                }
	            }
	        }
	        
	        return distances;
	    }
	    
	    public static void main(String[] args) {
	        
	        Map<Character, Map<Character, Integer>> graph = new HashMap<>();
	        graph.put('A', Map.of('B', 3, 'C', 4));
	        graph.put('B', Map.of('C', 1));
	        graph.put('C', Map.of('B', 2));
	        
	        char startVertex = 'A';
	        Map<Character, Integer> shortestDistances = dijkstra(graph, startVertex);
	        
	        System.out.println("Shortest distances from " + startVertex + ":");
	        for (Map.Entry<Character, Integer> entry : shortestDistances.entrySet()) {
	            System.out.println("To " + entry.getKey() + ": " + entry.getValue());
	        }
	    }

}
