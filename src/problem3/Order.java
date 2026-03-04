package problem3;

public class Order {

    private int orderId;
    private String productName;
    private double price;

    public Order(int orderId, String productName, double price) {
        this.orderId = orderId;
        this.productName = productName;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId +
                ", Product: " + productName +
                ", Price: ₹" + price);
    }
}