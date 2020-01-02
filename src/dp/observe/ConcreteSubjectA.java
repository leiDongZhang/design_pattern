package dp.observe;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubjectA implements Subject {
    List<Observe> list=new ArrayList<>();
    String action=null;

    @Override
    public void addOberve(Observe observe) {
        list.add(observe);
    }

    @Override
    public void removeObserve(Observe observe) {
        list.remove(observe);
    }

    @Override
    public void sendMessage() {
        for(Observe observe:list)
            observe.update(action);
    }

    @Override
    public void setState(String state) {
        action = state;
        sendMessage();
    }

    @Override
    public String getState() {
        return action;
    }
}
