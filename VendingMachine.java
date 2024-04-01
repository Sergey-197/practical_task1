// Class representing the vending machine for hot drinks
interface VendingMachine {
    HotDrink getProduct(String name, int volumeOrTemperature);
}

// Implementation of VendingMachine interface
class HotDrinkVendingMachine implements VendingMachine {
    HotDrink[] hotDrinks;

    public HotDrinkVendingMachine() {
        // Initialize some hot drinks
        hotDrinks = new HotDrink[]{
            new HotDrink("Tea", 200, 70),
            new HotDrink("Coffee", 250, 80),
            new HotDrink("Hot Chocolate", 300, 65)
        };
    }

    @Override
    public HotDrink getProduct(String name, int volumeOrTemperature) {
        for (HotDrink drink : hotDrinks) {
            if (drink.name.equals(name)) {
                if (drink.volume == volumeOrTemperature || drink.temperature == volumeOrTemperature) {
                    return drink;
                }
            }
        }
        return null;
    }
}
