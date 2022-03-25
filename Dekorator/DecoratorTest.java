public class DecoratorTest {
    public static void main(String arg[]) {
        Pizza pizza = new CheeseDecorator(new MeatDecorator(new SimplePizza()));
        System.out.println(pizza.make());
        // Ciasto + Szynka + Ser żółty
    }

}
