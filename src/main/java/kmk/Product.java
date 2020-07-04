package kmk;

public class Product {
    private final int weight;
    private final String product;

    public Product(String product, int weight) {
        this.product=product;
        this.weight=weight;

    }

    public String getProduct(){
        return this.product;
    }
    public int getWeight(){
        return this.weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", product='" + product + '\'' +
                '}';
    }
}
