public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) {
        super(name, url);
    }

    @Override
    public void displayMenu() {
        System.out.println(getName() + " : " + getUrl());
    }
}
