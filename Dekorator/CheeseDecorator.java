public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza customPizza) {
        super(customPizza);
    }

    @Override
    public String make() {
        return customPizza.make() + addCheese();
    }

    private String addCheese() {
        return " + Ser żółty";
    }

}
