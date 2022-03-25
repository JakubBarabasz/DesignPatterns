public class MeatDecorator extends PizzaDecorator {

    public MeatDecorator(Pizza customPizza) {
        super(customPizza);
    }

    @Override
    public String make() {
        return customPizza.make() + addMeat();
    }

    private String addMeat() {
        return " + Szynka";
    }

}
