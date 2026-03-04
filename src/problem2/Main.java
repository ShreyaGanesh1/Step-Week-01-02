package problem2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InventoryService inventory = new InventoryService(10);

        int choice;

        do {
            System.out.println("\n--- Flash Sale Inventory Manager ---");
            System.out.println("1. Purchase Item");
            System.out.println("2. Restock Item");
            System.out.println("3. View Stock");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter quantity to purchase: ");
                    int buyQty = scanner.nextInt();
                    inventory.purchase(buyQty);
                    break;

                case 2:
                    System.out.print("Enter quantity to restock: ");
                    int restockQty = scanner.nextInt();
                    inventory.restock(restockQty);
                    break;

                case 3:
                    inventory.viewStock();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}