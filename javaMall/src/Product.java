public class Product {
    int productId;
    String name;
    String description;
    double price;
    int stackQuantity;

    public Product(int productId, String name, String description, double price, int stackQuantity){
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stackQuantity = stackQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stackQuantity=" + stackQuantity +
                '}';
    }

    void updateStock(int quantity){
        this.stackQuantity += quantity;
    }

    void applyDiscount(double percentage){
        this.price = this.price * (1 - percentage);
    }
}
