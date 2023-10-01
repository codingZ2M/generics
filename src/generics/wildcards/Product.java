package generics.wildcards;

class Product extends InventoryItem {
	
    private String category;

    public Product(String name, double price, String category) {
        super(name, price);
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + " | Category: " + category;
    }
}
