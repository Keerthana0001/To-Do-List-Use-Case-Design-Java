// Observer Pattern Code 
public class ConcreteObserver implements Observer {
    private String name;
    private Subject1 subject;

    public ConcreteObserver(String name, Subject1 subject) {
        this.name = name;
        this.subject = subject;
        this.subject.addObserver(this);
    }

    public void update() {
        System.out.println(name + " received update!");
    }
}
