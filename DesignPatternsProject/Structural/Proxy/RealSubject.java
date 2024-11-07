// Proxy Pattern Code 
class RealSubject implements Subject {
    public void request() {
        System.out.println("RealSubject's request");
    }
}