package problem10;

public class Main {

    public static void main(String[] args) {

        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}