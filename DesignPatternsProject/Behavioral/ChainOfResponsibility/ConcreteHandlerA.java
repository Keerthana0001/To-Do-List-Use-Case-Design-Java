// Chain of Responsibility Pattern Code 
class ConcreteHandlerA implements Handler {
    private Handler nextHandler;

    public void setNext(Handler handler) {
        nextHandler = handler;
    }

    public void handle(String request) {
        if (request.equals("A")) {
            System.out.println("Handled by A");
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}