package Algos;

import java.util.*;


public class Dijkstra{
    public Map<V, Double> dijkstra(Vertex<V> source) {
        Map<V, Double> distances = new HashMap<>();
        PriorityQueue<Vertex<V>> pq = new PriorityQueue<>((v1, v2) -> Double.compare(v1.distFromSource, v2.distFromSource));

    
        for (Vertex<V> vertex : adj.keySet()) {
            distances.put(vertex.label, Double.POSITIVE_INFINITY);
            vertex.distFromSource = Double.POSITIVE_INFINITY;
        }

        source.distFromSource = 0.0; 
        pq.add(source);

        while (!pq.isEmpty()) {
            Vertex<V> current = pq.poll();

  
            for (Vertex<V> neighbor : adj.get(current)) {
                Double newDistance = current.distFromSource + getEdgeWeight(current, neighbor);
                if (newDistance < distances.get(neighbor.label)) {
                    distances.put(neighbor.label, newDistance);
                    neighbor.distFromSource = newDistance;
                    neighbor.setPredecessor(current); 
                    pq.remove(neighbor);
                    pq.add(neighbor);
                }
            }
        }

        return distances;
    }

  
    private Double getEdgeWeight(Vertex<V> u, Vertex<V> v) {
    
        return 1.0;  
    }

    // Method to reconstruct the shortest path from a target vertex to the source
    public List<V> reconstructShortestPath(Vertex<V> target) {
        List<V> path = new ArrayList<>();
        Vertex<V> current = target;

        // Traverse backwards from target to source using predecessors
        while (current != null) {
            path.add(0, current.label); 
            current = current.getPredecessor();
        }


        if (path.isEmpty()) {
            System.out.println("No path found from source to " + target.label);
            return null;
        }

        return path;
    }
}
