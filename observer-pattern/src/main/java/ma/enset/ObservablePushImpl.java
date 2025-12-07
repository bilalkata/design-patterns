package ma.enset;

import ma.enset.observers.ObservablePush;
import ma.enset.observers.ObserverPush;

import java.util.ArrayList;
import java.util.List;

public class ObservablePushImpl implements ObservablePush {

    private final List<ObserverPush> observers = new ArrayList<>();
    private int state;

    @Override
    public void subscribe(ObserverPush observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(ObserverPush observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(o -> o.update(this.state));
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }
}
