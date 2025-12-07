package ma.enset;


import ma.enset.observers.ObservablePull;
import ma.enset.observers.ObserverPull;

public class ObserverPullImpl1 implements ObserverPull {
    @Override
    public void update(ObservablePull observable) {
        if (observable instanceof ObservablePullImpl obs)
            System.out.println( "Observer 1 received state: " + obs.getState());
    }
}
