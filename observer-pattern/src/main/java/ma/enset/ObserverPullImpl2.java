package ma.enset;

import ma.enset.observers.ObservablePull;
import ma.enset.observers.ObserverPull;

import java.util.ArrayList;
import java.util.List;

public class ObserverPullImpl2 implements ObserverPull {

    private final List<Integer> history = new ArrayList<>();
    @Override
    public void update(ObservablePull observable) {
        if (observable instanceof ObservablePullImpl obs) {
            history.add(obs.getState());
            Integer sum = history.stream().reduce(0, Integer::sum);
            System.out.println("Observer 2 received state: " + obs.getState() + " and average : " + sum/history.size());
        }
    }
}
