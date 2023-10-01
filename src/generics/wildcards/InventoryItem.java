package generics.wildcards;

class InventoryItem {
	
    private String name;
    private double price;

    public InventoryItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item: " + name + " | Price: $" + price;
    }
}