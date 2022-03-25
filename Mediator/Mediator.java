public interface Mediator {
    void send(String message, Colleague colleague);

    void addColleague(Colleague colleague);
}
