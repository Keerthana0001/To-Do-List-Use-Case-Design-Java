# Design Patterns in Java

This repository demonstrates various **Design Patterns** implemented in Java. It includes the Memento and Observer design patterns, following the structure and principles of each pattern.

## Table of Contents
- [Memento Pattern](#memento-pattern)
- [Observer Pattern](#observer-pattern)
- [Folder Structure](#folder-structure)

---

## Memento Pattern

The **Memento Pattern** is used to capture the state of an object and store it externally, so that it can be restored later. This is useful for undo/redo operations or storing a snapshot of an object's state.

### Classes:

1. **Originator.java**:  
   - Contains the state of the object that we want to save or restore. It provides methods to set the state and save it to a `Memento` object.
  
2. **Memento.java**:  
   - Stores the state of the `Originator` object. It is immutable and can only provide the stored state.
  
3. **Caretaker.java**:  
   - Manages and stores the `Memento` objects. It is responsible for saving and restoring the `Memento` at appropriate times.

4. **MementoPatternDemo.java**:  
   - Demonstrates the Memento Pattern by showing how the `Originator`'s state can be saved and restored using the `Memento` and `Caretaker`.

### Code Example:

- **Originator.java**
    ```java
    public class Originator {
        private String state;
    
        public void setState(String state) {
            this.state = state;
        }
    
        public String getState() {
            return state;
        }
    
        public Memento saveStateToMemento() {
            return new Memento(state);
        }
    
        public void restoreStateFromMemento(Memento memento) {
            state = memento.getState();
        }
    }
    ```

- **Memento.java**
    ```java
    public class Memento {
        private final String state;
    
        public Memento(String state) {
            this.state = state;
        }
    
        public String getState() {
            return state;
        }
    }
    ```

- **Caretaker.java**
    ```java
    import java.util.Stack;
    
    public class Caretaker {
        private Stack<Memento> mementoStack = new Stack<>();
    
        public void addMemento(Memento memento) {
            mementoStack.push(memento);
        }
    
        public Memento getMemento() {
            return mementoStack.pop();
        }
    }
    ```

---

## Observer Pattern

The **Observer Pattern** is a behavioral design pattern that allows a subject to notify its dependent observers automatically when its state changes. This is useful in scenarios like event handling, model-view-controller (MVC) architectures, or any time one object needs to notify multiple others about a change.

### Classes:

1. **Subject.java**:  
   - Maintains a list of observers and notifies them when its state changes.
  
2. **Observer.java**:  
   - An interface that defines the `update` method, which must be implemented by any class that wants to be notified of changes in the `Subject`.

3. **ConcreteObserver.java**:  
   - Implements the `Observer` interface and responds to updates from the `Subject`.

4. **ObserverPatternDemo.java**:  
   - Demonstrates how the `Observer` pattern works by showing a `Subject` notifying its observers when changes occur.

### Code Example:

- **Subject.java**
    ```java
    import java.util.ArrayList;
    import java.util.List;
    
    public class Subject {
        private List<Observer> observers = new ArrayList<>();
    
        public void addObserver(Observer observer) {
            observers.add(observer);
        }
    
        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }
    
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update();
            }
        }
    }
    ```

- **Observer.java**
    ```java
    public interface Observer {
        void update();
    }
    ```

- **ConcreteObserver.java**
    ```java
    public class ConcreteObserver implements Observer {
        private String name;
        private Subject subject;
    
        public ConcreteObserver(String name, Subject subject) {
            this.name = name;
            this.subject = subject;
            this.subject.addObserver(this);
        }
    
        public void update() {
            System.out.println(name + " received update!");
        }
    }
    ```

---

## Folder Structure

```plaintext
Behavioral/
    ├── MementoPattern/
    │   ├── Originator.java
    │   ├── Memento.java
    │   ├── Caretaker.java
    │   └── MementoPatternDemo.java
    └── ObserverPattern/
        ├── Subject.java
        ├── Observer.java
        ├── ConcreteObserver.java
        └── ObserverPatternDemo.java
