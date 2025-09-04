public class ItemMain {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 45000);
        item1.displayDetails();
        int quantity = 2;
        System.out.println("Total Cost for " + quantity + " items: " + item1.calculateTotalCost(quantity));
    }
}