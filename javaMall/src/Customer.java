import java.util.ArrayList;
import java.util.List;

public class Customer {
    int customerId;
    String email;
    String name;
    String shippingAddress;
    List<Order> orderHistory;

    public Customer(int customerId, String email, String name, String shippingAddress){
        this.customerId = customerId;
        this.email = email;
        this.name = name;
        this.shippingAddress = shippingAddress;
        this.orderHistory = new ArrayList<Order>();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", orderHistory=" + orderHistory +
                '}';
    }

    void listingOrders(List<Order> orders, int customerId){
        for (Order o: orders) {
            if (o.customerId == customerId) {
                orderHistory.add(o);
            }else{
                System.out.println("주문 내역이 없습니다.");
            }
        }
    }

    void placeOrder(int customerId, Order order){
        orderHistory.add(order);
    }

    void cancelOrder(Order order, int customerId){
        if (order.customerId != customerId) {
            System.out.println("주문 취소 권한이 없습니다.");
            return;
        }
        orderHistory.remove(order);
    }

    void updateProfile(String name, String email, String shippingAddress){
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
    }
}
