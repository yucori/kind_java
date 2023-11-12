public class Book {
    int id;
    String isbn;
    String title;
    String author;
    double price;
    int stockQuantity;

    void updateStock(int quantity){
        stockQuantity = quantity;
    }

    void applyDiscount(double discount){
        price -= price * discount;
    }
}
