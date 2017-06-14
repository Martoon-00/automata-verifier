package verifier.automata;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.management.modelmbean.XMLParseException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
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

        // TODO: start with this
        /*
        // preparations
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(is);

        doc.getDocumentElement().normalize();

        // get automata name
        Node nameNode = doc.getElementsByTagName("name").item(0);
        if (nameNode.getNodeType() != Node.ELEMENT_NODE) {
            throw new AutomataParseException("Name is absent");
        }
        Element nameElement = (Element) nameNode;
        String name = nameElement.getTextContent();
        Automata automata = new Automata(name);

        // and so on...

        return automata;
        */
    }
}
