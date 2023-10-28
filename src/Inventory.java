import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<Item>();
    ArrayList<FoodItem> nonExpiredFoods = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double getInventoryValue() {
        double value = 0;
        for (Item item : items) {
            value += item.getPrice();
        }
        return value;
    }

    public void printInventory() {
        System.out.println("Inventory:");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }

    /**
     * The removeExpiredFood function removes all expired food items from the inventory.

     *
     *
     * @return A boolean value
     *
     */
    public void removeExpiredFood() {
        items.removeIf(IExpireable::isExpired);
    }
}
