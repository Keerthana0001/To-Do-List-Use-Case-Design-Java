public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject1 subject = new Subject1();

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1", subject);
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2", subject);

        subject.notifyObservers();  // Notify observers

        // Remove an observer and notify again
        subject.removeObserver(observer1);
        subject.notifyObservers();
    }
}
