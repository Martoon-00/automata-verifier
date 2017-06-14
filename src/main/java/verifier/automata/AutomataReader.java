package verifier.automata;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * Allows to parse automata given in XML format.
 */
public class AutomataReader {
    public static void main(String[] args) throws IOException {
        // Example of how to use this automata reader.
        // You can launch it!

        Automata automata = new AutomataReader().readAutomata(null);
        System.out.printf("Read automata:\n" + automata);

        // TODO: uncomment
        /*
        String inputFilePath = "<Specify path to XML here>";

        try (InputStream is = new FileInputStream(inputFilePath)){
            Automata automata = new AutomataReader().readAutomata(is);
            System.out.printf("Read automata: " + automata);
        } catch (FileNotFoundException e) {
            System.out.println("No such file: " + inputFilePath);
        }
        */
    }

    public Automata readAutomata(InputStream is) {
        // Dummy return of example automata. This is part of result, which should be returned by reading of
        // "AChart.xstd" file.
        // TODO: Replace it with actual reading!

        Automata automata = new Automata("My automata");

        automata.getEvents().addAll(Arrays.asList(
                new AutomataEvent("id", "We see the word \"id\""),
                new AutomataEvent("number", "")
        ));

        AutomataState state0 = new AutomataState(0, "State0");
        state0.getIncomings().addAll(Arrays.asList(4, 13));
        state0.getOutgoings().addAll(Arrays.asList(3, 5));
        automata.getStates().add(state0);

        AutomataTransition transition4 = new AutomataTransition(4);
        transition4.setEvent(new AutomataEvent("number", ""));
        transition4.setAction(new AutomataAction("SetID", ""));
        automata.getTransitions().add(transition4);

        return automata;
    }
}
