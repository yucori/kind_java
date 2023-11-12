import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 책 인스턴스 생성
        Book book1 = new Book("978-3-16-148410-0", "자바의 정석", "남궁성", 30000, 10);

        // 고객 인스턴스 생성
        Customer customer1 = new Customer(1, "cust123@gmail.com", "홍길동", "서울특별시 서울구");

        // 주문 인스턴스 생성 및 고객에게 할당
        Order order1 = new Order(customer1, new ArrayList<>(), 0, "pending");
        customer1.getOrders().add(order1);

        // 주문에 책 추가 및 주문 상태 업데이트
        order1.getBooks().add(book1);
        order1.calculateTotalPrice(); // 총 가격 계산
        order1.confirmOrder(); // 주문 확정
    }

    System.out.println("고객 이름: " + customer1.getName());
    System.out.println("주문 번호: " + order1.getOrderId());
    System.out.println("주문 상태: " + order1.getStatus());
    System.out.println("주문 총액: " + order1.getTotalPrice());

    for (Book book : order1.getBooks()) {
            System.out.println("책 제목: " + book.getTitle() + " | 저자: " + book.getAuthor() + " | 가격: " + book.getPrice());
    }
}