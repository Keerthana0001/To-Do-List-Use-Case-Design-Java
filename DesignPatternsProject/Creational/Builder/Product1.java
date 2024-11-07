// Builder Pattern Code 
class Product1 {
    private String part1;
    private String part2;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "Product [part1=" + part1 + ", part2=" + part2 + "]";
    }
}