public class CompositeTest {
    public static void main(String args[]) {

        MenuComponent designPattern = new Menu("Design Pattern", "/designPattern");
        MenuComponent creationDesignPattern = new Menu("Creation Design Pattern", "/creationDesignPattern");
        MenuComponent structureDesignPattern = new Menu("Structure Design Pattern", "/structureDesignPattern");
        MenuComponent behavioralDesignPattern = new Menu("Behavioral Design Pattern", "/behavioralDesignPattern");
        designPattern.add(creationDesignPattern);
        designPattern.add(structureDesignPattern);
        designPattern.add(behavioralDesignPattern);

        creationDesignPattern.add(new MenuItem("Singleton", "/singleton"));
        creationDesignPattern.add(new MenuItem("Factory", "/factory"));
        creationDesignPattern.add(new MenuItem("Prototype", "/prototype"));

        structureDesignPattern.add(new MenuItem("Adapter", "/adapter"));
        structureDesignPattern.add(new MenuItem("Bridge", "/bridge"));
        structureDesignPattern.add(new MenuItem("Composite", "/composite"));

        designPattern.displayMenu();
    }
}
