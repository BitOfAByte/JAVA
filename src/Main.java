import java.time.*;

public class Main {
    public static void main(String[] args) {
        FoodItem item = new FoodItem("Milk", 2.99, LocalDate.of(2024, 1, 1));
        FoodItem item2 = new FoodItem("Cheese", 3.99, LocalDate.of(2021, 1, 1));


        Inventory inventory = new Inventory();
        inventory.addItem(item);
        inventory.addItem(item2);

        inventory.printInventory();


        inventory.removeExpiredFood();
        inventory.printInventory();
    }
}