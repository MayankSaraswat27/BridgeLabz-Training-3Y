public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        CartItem item1 = new CartItem("Laptop", 45000, 1);
        CartItem item2 = new CartItem("Headphones", 2000, 2);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayTotalCost();

        cart.removeItem("Headphones");
        cart.displayTotalCost();
    }
}
