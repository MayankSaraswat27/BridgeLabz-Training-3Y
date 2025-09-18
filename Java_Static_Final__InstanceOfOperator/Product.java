public class Product {
    private static double discount = 10;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProduct() {
        if (this instanceof Product) {
            double finalPrice = price - (price * discount / 100);
            System.out.println("Product Details :");
            System.out.println("Product: " + productName);
            System.out.println("Price after discount: " + finalPrice);
            System.out.println("Quantity: " + quantity);
        }
    }
}
