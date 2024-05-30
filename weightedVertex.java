public class weightedVertex<W, V> extends Vertex<V> {
    private W weight;

    // post : Constructs a vertex with given label and given weight
    public weightedVertex (V label, W weight) {
        super(label);
        this.weight = weight;
    }
}