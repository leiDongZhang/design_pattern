package dp.observe;

public class ObserveA implements Observe {
    String name;
    String message;

    public ObserveA(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message=message;
        System.out.println(name+"收到通知:"+message);
    }
}
