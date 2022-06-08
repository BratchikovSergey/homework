public class CoffeeFactory {
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case Americano:
                coffee = new Americano();
                break;
            case Espresso:
                coffee = new Espresso();
                break;
        }

        return coffee;
    }
}
