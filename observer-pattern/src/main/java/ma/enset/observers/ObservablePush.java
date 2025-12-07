package ma.enset.observers;

public interface ObservablePush {
    void subscribe(ObserverPush observer);
    void unsubscribe(ObserverPush observer);
    void notifyObservers();
}
