package verifier.automata;

import com.sun.istack.internal.Nullable;

/**
 * Created by Martoon.
 */
public class AutomataTransition extends AutomataItem<Integer> {
    @Nullable
    private AutomataEvent event;
    @Nullable
    private AutomataAction action;

    public AutomataTransition(int id) {
        super(id);
    }

    public AutomataEvent getEvent() {
        return event;
    }

    public void setEvent(AutomataEvent event) {
        this.event = event;
    }

    public AutomataAction getAction() {
        return action;
    }

    public void setAction(AutomataAction action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Transition: " + super.toString();
    }
}
