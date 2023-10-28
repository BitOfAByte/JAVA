public abstract class NonFoodItem extends Item {

    private final String[] materials;
    NonFoodItem(String name, double price, String[] materials) {
        super(name, price);
        this.materials = materials;
    }


    public String[] getMaterials() {
        return this.materials;
    }

    @Override
    public String toString () {
        String m = "[";
        for(int i = 0; i < materials.length; i++) {
            m += (i == 0 ? "" : ", ") + materials[i];
        }
        return "NonFoodItem name= " + this.getName()+ " price= "+getPrice()+ " materials= "+ m + "] ";
    }
}
