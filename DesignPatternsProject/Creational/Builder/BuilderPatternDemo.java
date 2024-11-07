// Builder Pattern Code 
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Product1 product = new ProductBuilder()
            .buildPart1("Part 1")
            .buildPart2("Part 2")
            .build();
        System.out.println(product);
    }
}