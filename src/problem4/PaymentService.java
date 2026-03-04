package problem4;

public class PaymentService {

    public void processPayment(double amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }

        System.out.println("Payment of ₹" + amount + " processed successfully!");
    }
}