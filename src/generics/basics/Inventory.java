package generics.basics;

import java.util.ArrayList;
import java.util.List;

class Inventory<T> {

	private List<T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public boolean removeItem(T item) {
        return items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }

    public void displayInventory() {
        for (T item : items) {
            System.out.println(item.toString());
        }
    }
}
