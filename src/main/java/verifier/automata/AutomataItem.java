package verifier.automata;

import java.util.ArrayList;
import java.util.List;

/**
 * Single automata item, state or transition.
 *
 * @param <N> Type of neighbour
 */
public class AutomataItem<N> {
    private final int id;

    // Ids of incoming transitions
    private final List<N> incomings = new ArrayList<>();

    // Ids of outgoing transitions
    private final List<N> outgoings = new ArrayList<>();

    public AutomataItem(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<N> getIncomings() {
        return incomings;
    }

    public List<N> getOutgoings() {
        return outgoings;
    }

    @Override
    public String toString() {
        return "{ " +
                "id=" + id +
                ", incomings=" + incomings +
                ", outgoings=" + outgoings +
                " }";
    }
}
