package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

class Inventory<T> {
	
	// Upper-Bounded Wildcard (? extends T):
	/*
	 <? extends T>: This part introduces the wildcard with an upper bound. Here's what it means:
	?: The question mark ? is a wildcard character used in generics to represent an unknown type. 
	In this case, it's used as a placeholder for a specific type.
	extends T: The extends keyword is followed by T, which represents a type parameter. It specifies that 
	the unknown type should be a subtype of or the same type as T. In other words, it allows items to hold
	 a collection of elements of type T or any subtype of T.
	 */
    private List<? extends T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        ((List<T>) items).add(item);
    }

    public boolean removeItem(T item) {
        return ((List<T>) items).remove(item);
    }

    public List<? extends T> getItems() {
        return items;
    }

    public void displayInventory() {
        for (T item : items) {
            System.out.println(item.toString());
        }
    }
}