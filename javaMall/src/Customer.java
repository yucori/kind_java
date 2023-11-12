public class Customer {
    int id;
    String email;
    String name;
    String shippingAddress;
    String orderHistory;

    public Customer(int id, String email, String name, String shippingAddress){
        this.id = id;
        this.email = email;
        this.name = name;
        this.shippingAddress = shippingAddress;
    }

    void placeOrder(Order order){

    }

    void cancelOrder(Order order){

    }

    void updateProfile(String name, String email, String shippingAddress){
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
    }
}
