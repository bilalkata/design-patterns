package ma.enset.observers;

public interface ObservablePull {
    void subscribe(ObserverPull observer);
    void unsubscribe(ObserverPull observer);
    void notifyObservers();
}
