public class Order {
    public int orderId;
    String status;
    Product orderedProduct;
    int productAmount;
    double totalPrice;
    int customerId;
    String orderDate;

    public Order(int orderId, Product orderedProduct, String status, int productAmount, int customerId, String orderDate){
        this.orderId = orderId;
        this.orderedProduct = orderedProduct;
        this.status = status;
        this.productAmount = productAmount;
        this.totalPrice = (double) (orderedProduct.price * productAmount);
        this.customerId = customerId;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderedProduct='" + orderedProduct + '\'' +
                ", status='" + status + '\'' +
                ", productAmount=" + productAmount +
                ", totalPrice=" + totalPrice +
                ", customerId=" + customerId +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }

    void updateStatus(String status){
        this.status = status;
    }
}
