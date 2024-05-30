public class Main {

    public static void main(String[] args) {
        // Create a directed adjacency list graph with weighted vertices
        AdjacencyList<String> graph = new AdjacencyList<>(true);

        // Add weighted vertices
        graph.addVertex(new weightedVertex<>("A", 5.0));
        graph.addVertex(new weightedVertex<>("B", 2.0));
        graph.addVertex(new weightedVertex<>("C", 1.0));
        graph.addVertex(new weightedVertex<>("D", 3.0));
        graph.addVertex(new weightedVertex<>("E", 4.0));

        // Create connections with weights (assuming directed edges)
        graph.connectVertices("A", "B", 10.0);
        graph.connectVertices("A", "C", 3.0);
        graph.connectVertices("B", "D", 2.0);
        graph.connectVertices("C", "D", 1.0);
        graph.connectVertices("C", "E", 5.0);
        graph.connectVertices("D", "E", 1.0);

        // Print the weighted graph
        System.out.println("Weighted Adjacency List:");
        graph.printWeightedGraph();
        System.out.println();

        // Perform Dijkstra's algorithm from vertex A
        String sourceLabel = "A";
        Map<String, Double> distances = graph.dijkstra(new Vertex<>(sourceLabel));
        System.out.println("Dijkstra's Shortest Paths from " + sourceLabel + " (considering vertex weights):");
        for (Map.Entry<String, Double> entry : distances.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

        // Perform BFS traversal from vertex A
        sourceLabel = "A";
        graph.bfs(new Vertex<>(sourceLabel));
        System.out.println("BFS Traversal from " + sourceLabel + ":");
    }
}
