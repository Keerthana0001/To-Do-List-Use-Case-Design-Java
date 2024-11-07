// Memento Pattern Code 
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #2");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #3");

        // Restore to the previous state
        originator.restoreStateFromMemento(caretaker.getMemento());
        System.out.println("Restored to: " + originator.getState());

        // Restore to the first state
        originator.restoreStateFromMemento(caretaker.getMemento());
        System.out.println("Restored to: " + originator.getState());
    }
}
