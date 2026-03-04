package problem5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FileService service = new FileService();

        int choice;

        do {
            System.out.println("\n--- User Data Storage System ---");
            System.out.println("1. Add User Data");
            System.out.println("2. View All Data");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter user data: ");
                    String data = scanner.nextLine();
                    service.writeToFile(data);
                    break;

                case 2:
                    service.readFromFile();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        scanner.close();
    }
}