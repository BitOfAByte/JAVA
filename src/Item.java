public abstract class Item implements IExpireable {
    private String name;
    private double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }


    public Double getPrice() {
        return this.price;
    }
}
