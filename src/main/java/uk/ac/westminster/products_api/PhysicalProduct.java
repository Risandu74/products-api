package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it shares the core id, name, and price fields of a generic product.
// A class like ShoppingCart would NOT pass this test because a cart HAS-A product, it is not a product itself.
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() { return weightKg; }
    public String getDimensions() { return dimensions; }
}