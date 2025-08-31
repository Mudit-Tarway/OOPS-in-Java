
import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}

class Cart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
        System.out.println(p.getName() + " added to cart.");
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void displayCart() {
        System.out.println("\nItems in Cart:");
        for (Product p : products) {
            System.out.println("- " + p.getName());
        }
    }
}

class Order {
    public void displayOrderDetails(Cart cart) {
        double total = 0;
        System.out.println("\nOrder Details:");
        for (Product p : cart.getProducts()) {
            double itemTotal = p.getPrice() * p.getQuantity();
            total += itemTotal;
            System.out.println(p.getName() + " | Price: " + p.getPrice() + " | Quantity: " + p.getQuantity() + " | Item Total: " + itemTotal);
        }
        System.out.println("Total Price: " + total);
    }

    public void processPayment(double amount, double total) {
        if (amount >= total) {
            System.out.println("Payment successful! Change: " + (amount - total));
        } else {
            System.out.println("Insufficient payment. Please pay at least " + total);
        }
    }
}

public class question3 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 1);
        Product p2 = new Product("Mouse", 800, 2);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.displayCart();

        Order order = new Order();
        order.displayOrderDetails(cart);

        // Simulating payment
        double totalCost = (p1.getPrice() * p1.getQuantity()) + (p2.getPrice() * p2.getQuantity());
        order.processPayment(52000, totalCost);
    }
}
