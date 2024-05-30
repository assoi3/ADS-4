public class Edge<V> {

    private final Vertex<V> source;
    private final Vertex<V> destination;
    private final Double weight;  // Optional weight for the edge

    public Edge(Vertex<V> source, Vertex<V> destination) {
        this.source = source;
        this.destination = destination;
        this.weight = null;  // No weight by default
    }

    public Edge(Vertex<V> source, Vertex<V> destination, Double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex<V> getSource() {
        return source;
    }

    public Vertex<V> getDestination() {
        return destination;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "(" + source.getLabel() + ", " + destination.getLabel() + (weight != null ? ", " + weight : "") + ")";
    }
}
