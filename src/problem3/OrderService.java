package problem3;

import java.util.ArrayList;

public class OrderService {

    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Order added successfully!");
    }

    public void viewOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders available.");
            return;
        }

        for (Order order : orders) {
            order.displayOrder();
        }
    }

    public void calculateTotal() {
        double total = 0;
        for (Order order : orders) {
            total += order.getPrice();
        }
        System.out.println("Total Revenue: ₹" + total);
    }
}