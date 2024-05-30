import java.util.*;

public class AdjacencyList<V> implements Graph<V> {

    private Map<Vertex<V>, Set<Vertex<V>>> adj;  // Use Set for neighbors instead of List
    private final boolean isDirected;

    // Constructs an empty adjacency list
    public AdjacencyList(boolean directed) {
        isDirected = directed;
        adj = new HashMap<>();
    }

    @Override
    public Set<Vertex<V>> vertices() {
        return new HashSet<>(adj.keySet());
    }

    // Adds given vertex to graph
    public void addVertex(Vertex<V> v){
        if (!adj.containsKey(v)) {
            adj.put(v, new HashSet<>());
        }
    }

    // Removes given vertex from graph (modifies connections of other vertices)
    public void removeVertex(Vertex<V> v) {
        adj.remove(v);
        if (!isDirected) {
            for (Set<Vertex<V>> neighbors : adj.values()) {
                neighbors.remove(v);
            }
        }
    }

    // Checks if given vertex is in graph
    // Returns true if found and false otherwise
    public boolean containsVertex(Vertex<V> vertex) {
        return adj.containsKey(vertex);
    }

    // Creates a connection between two vertices (undirected by default)
    public void connectVertices(Vertex<V> source, Vertex<V> destination) {
        if (!adj.containsKey(source)) {
            addVertex(source);
        }
        adj.get(source).add(destination);
        if (!isDirected) { 
            if (!adj.containsKey(destination)) {
                addVertex(destination);
            }
            adj.get(destination).add(source);
        }
    }

    // Returns a string representation of the adjacency list
    public String toString() {
        StringBuilder s = new StringBuilder();
        String newline = "";
        for (Map.Entry<Vertex<V>, Set<Vertex<V>>> entry : adj.entrySet()) {
            s.append(newline)
             .append(entry.getKey())
             .append(": ")
             .append(entry.getValue());
            newline = "\n";
        }
        return (s.toString());
    }

    public void connectVertices(String string, String string2, double d) {
    }

    public void printWeightedGraph() {
    }

    public Map<String, Double> dijkstra(Vertex vertex) {
        return null;
    }

    public void bfs(Vertex vertex) {
    }
}
