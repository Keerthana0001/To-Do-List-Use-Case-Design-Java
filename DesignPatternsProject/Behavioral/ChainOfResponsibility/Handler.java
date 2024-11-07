// Chain of Responsibility Pattern Code 
interface Handler {
    void setNext(Handler handler);
    void handle(String request);
}
