import java.util.Set;

public interface Graph<V> {

    Set<Vertex<V>> vertices();
    void addVertex(Vertex<V> vertex);
    void removeVertex(Vertex<V> vertex);
    boolean containsVertex(Vertex<V> vertex);
    void connectVertices(Vertex<V> source, Vertex<V> destination);

}