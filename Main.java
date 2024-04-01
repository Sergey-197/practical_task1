public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();

        // Test the vending machine logic
        HotDrink drink1 = vendingMachine.getProduct("Tea", 200);
        HotDrink drink2 = vendingMachine.getProduct("Coffee", 80);

        System.out.println("Drink 1: " + drink1.name + " - " + drink1.volume + "ml - " + drink1.temperature + "°C");
        System.out.println("Drink 2: " + drink2.name + " - " + drink2.volume + "ml - " + drink2.temperature + "°C");
    }
}