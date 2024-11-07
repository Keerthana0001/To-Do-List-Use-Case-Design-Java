// Chain of Responsibility Pattern Code 
public class ChainOfResponsibilityPatternDemo {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        handlerA.handle("A");
    }
}