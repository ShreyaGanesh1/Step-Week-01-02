package problem2;

public class InventoryService {

    private int stock;

    public InventoryService(int initialStock) {
        this.stock = initialStock;
    }


    public void purchase(int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }

        if (stock >= quantity) {
            stock -= quantity;
            System.out.println("Purchase successful! Items left: " + stock);
        } else {
            System.out.println("Not enough stock available!");
        }
    }

    public void restock(int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid restock quantity.");
            return;
        }

        stock += quantity;
        System.out.println("Restocked successfully! Total stock: " + stock);
    }

    public void viewStock() {
        System.out.println("Current Stock: " + stock);
    }
}