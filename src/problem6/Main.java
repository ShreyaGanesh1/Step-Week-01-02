package problem6;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        TransactionThread t1 = new TransactionThread(account, 700, "User-1");
        TransactionThread t2 = new TransactionThread(account, 500, "User-2");

        t1.start();
        t2.start();
    }
}