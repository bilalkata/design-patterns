package ma.enset;

import ma.enset.observers.ObservablePull;
import ma.enset.observers.ObserverPull;

import java.util.ArrayList;
import java.util.List;

public class ObservablePullImpl implements ObservablePull {

    private final List<ObserverPull> observers = new ArrayList<>();
    private int state;

    @Override
    public void subscribe(ObserverPull observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(ObserverPull observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(o -> o.update(this));
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }
}
