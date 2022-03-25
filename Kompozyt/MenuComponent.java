public abstract class MenuComponent {

    private String name;
    private String url;

    public MenuComponent(String name,String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract void displayMenu();
}

