package dp.observe;

public interface Subject {

    void addOberve(Observe observe);

    void removeObserve(Observe observe);

    void sendMessage();

    void setState(String state);

    String getState();
}
