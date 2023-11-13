import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Customer customer1 = new Customer(1, "1234@gmail.com", "홍길동", "서울시 강남구");
        System.out.println(customer1);

        customer1.updateProfile("김철수", "1234@gmail.com", "서울시 강남구");
        System.out.println(customer1);

        Product product1 = new Product(1, "사과", "맛있는 사과", 1000, 100);
        Product product2 = new Product(2, "배", "맛있는 배", 2000, 100);
        Product product3 = new Product(3, "딸기", "맛있는 딸기", 3000, 100);

        product1.updateStock(-2);
        product1.applyDiscount(0.1);
        System.out.println(product1);

        Order order1 = new Order(1, product1, "결제완료", 2, 1, "2023-01-01");
        System.out.println(order1);

        Order order2 = new Order(2, product2, "결제완료", 3, 2, "2023-01-01");

        orders.add(order1);
        orders.add(order2);

        customer1.listingOrders(orders, 1);
        System.out.println(customer1);

        orders.clear();

    }
}