package verifier.automata;

/**
 * Created by Martoon.
 */
public class AutomataAction {
    private final String name;
    private final String comment;

    public AutomataAction(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        if (comment.isEmpty()) {
            return name;
        } else {
            return String.format("%s (%s)", name, comment);
        }
    }
}
