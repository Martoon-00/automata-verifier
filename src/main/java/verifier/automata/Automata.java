package verifier.automata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martoon.
 */
public class Automata {
    private final String name;

    private final List<AutomataState> states = new ArrayList<>();
    private final List<AutomataTransition> transitions = new ArrayList<>();

    private final List<AutomataEvent> events = new ArrayList<>();

    public Automata(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<AutomataState> getStates() {
        return states;
    }

    public List<AutomataTransition> getTransitions() {
        return transitions;
    }

    public List<AutomataEvent> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return "Automata " +
                "'" + name + "\' {" +
                "\n, states = " + states +
                "\n, transitions = " + transitions +
                "\n, events = " + events +
                "\n}";
    }
}
