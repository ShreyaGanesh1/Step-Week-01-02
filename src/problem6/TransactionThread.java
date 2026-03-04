package problem6;

public class TransactionThread extends Thread {

    private BankAccount account;
    private int amount;

    public TransactionThread(BankAccount account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}