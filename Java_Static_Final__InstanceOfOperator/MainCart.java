public class MainCart {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product.updateDiscount(15);
        p1.displayProduct();
    }
}
