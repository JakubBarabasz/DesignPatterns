public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new ApplicationMediator();
        Colleague desktop = new DesktopColleague(mediator);
        Colleague mobile = new MobileColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Witam!");
        mobile.send("Elo!");
        desktop.send("Cześć!");
        mobile.send("Siemanko!");

    }
}


