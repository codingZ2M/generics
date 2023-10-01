package generics.wildcards;

public class ProductInventory {

	    public static void main(String[] args) {
	    	
	        Inventory<Product> productInventory = new Inventory<>();

	        Product product1 = new Product("Laptop", 999.99, "Electronics");
	        Product product2 = new Product("Smartphone", 499.99, "Electronics");

	        productInventory.addItem(product1);
	        productInventory.addItem(product2);

	        System.out.println("Product Inventory:");
	        productInventory.displayInventory();
	     
	        productInventory.removeItem(product2);
	        
	        System.out.println("Product Inventory after removing the product2:");
	        productInventory.displayInventory();
	    }
	}