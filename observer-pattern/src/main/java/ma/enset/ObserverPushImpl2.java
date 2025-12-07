package ma.enset;

import ma.enset.observers.ObserverPush;

import java.util.ArrayList;
import java.util.List;

public class ObserverPushImpl2 implements ObserverPush {

    private final List<Integer> history = new ArrayList<>();
    @Override
    public void update(int state) {
        history.add(state);
        Integer sum = history.stream().reduce(0, Integer::sum);
        System.out.println("Observer 2 received state: " + state + " and average : " + sum/history.size());
    }
}
