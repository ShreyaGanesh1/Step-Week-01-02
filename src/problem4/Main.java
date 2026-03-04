package problem4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PaymentService service = new PaymentService();

        System.out.println("--- Payment Processing System ---");
        System.out.print("Enter payment amount: ");

        double amount = scanner.nextDouble();

        try {
            service.processPayment(amount);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}