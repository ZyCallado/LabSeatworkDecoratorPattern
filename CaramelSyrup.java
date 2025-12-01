public class CaramelSyrup implements CoffeeDecorator {
    private Coffee coffee;

    @Override
    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Caramel Syrup";
    }

    @Override
    public String getCost() {
        return coffee.getCost() + " + ₱40.00";
    }
}