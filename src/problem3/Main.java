package problem3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OrderService service = new OrderService();

        int choice;

        do {
            System.out.println("\n--- Order Processing System ---");
            System.out.println("1. Add Order");
            System.out.println("2. View Orders");
            System.out.println("3. Calculate Total Revenue");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Order ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();

                    service.addOrder(new Order(id, name, price));
                    break;

                case 2:
                    service.viewOrders();
                    break;

                case 3:
                    service.calculateTotal();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}