// Adapter Pattern Code 
public class AdapterPatternDemo {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}