package verifier.automata;

/**
 * State of automata.
 */
public class AutomataState extends AutomataItem<Integer> {
    private final String name;

    public AutomataState(int id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return "State \"" + name + "\": " + super.toString();
    }
}
