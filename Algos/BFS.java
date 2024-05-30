import java.util.*;
import AdjacencyList;

public class Algos {

   // private static int time;

    // Performs breadth-first search
    public void bfs(Vertex<V> s){
        Queue<Vertex<V>> frontier = new LinkedList<>();
        Set<Vertex<V>> discovered = new HashSet<>();
        frontier.add(s);
        discovered.add(s.label);
        s.discoveredTimestamp = 0;
        while (!frontier.isEmpty()) {
            Vertex<V> u = frontier.poll();
            System.out.println("Visited vertex: " + u.label);
            for (Vertex<V> e : adj.get(u).keySet()) {
            //    Vertex<V> v = e.getV();
                if (!discovered.contains(neighbor.label)) {
                 //   v.setPredecessor(u);
                    neighbor.discoveredTimestamp = u.discoverredTimestamp + 1; //Update ddiscoveredTimeStamp
                    frontier.add(neighbor);
                    discovered.add(neighbor.label);
                }
            }
        }

    }
}

