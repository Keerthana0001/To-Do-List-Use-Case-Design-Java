// Builder Pattern Code 
class ProductBuilder {
    private Product1 product = new Product1();

    public ProductBuilder buildPart1(String part1) {
        product.setPart1(part1);
        return this;
    }

    public ProductBuilder buildPart2(String part2) {
        product.setPart2(part2);
        return this;
    }

    public Product1 build() {
        return product;
    }
}