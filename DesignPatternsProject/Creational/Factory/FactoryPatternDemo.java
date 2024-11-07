// Factory Pattern Code 
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Product product = ProductFactory.getProduct("A");
        product.create();
    }
}