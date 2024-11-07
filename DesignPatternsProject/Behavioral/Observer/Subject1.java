import java.util.ArrayList;
import java.util.List;

public class Subject1 {
    private List<Observer> observers = new ArrayList<>();

    // Add an observer to the list
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove an observer from the list
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
