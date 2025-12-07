package ma.enset;

import ma.enset.observers.ObserverPull;
import ma.enset.observers.ObserverPush;

import java.util.ArrayList;
import java.util.List;

public class ObserverDemo {

    static void main() {
        System.out.println(">>> Observer Push <<<");
        ObservablePushImpl observable = new ObservablePushImpl();
        ObserverPush observer1 = new ObserverPushImpl1();
        ObserverPush observer2 = new ObserverPushImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);
        observable.setState(10);
        observable.setState(20);
        observable.setState(30);
        observable.unsubscribe(observer2);
        observable.setState(40);
        observable.setState(50);
        observable.subscribe(state -> {
            List<Integer> history = new ArrayList<>();
            history.add(state);
            System.out.println( "Observer 3 received state: " + state + "and sum: " + history.stream().reduce(0, Integer::sum));
        });
        observable.setState(90);
        observable.setState(10);
        observable.unsubscribe(observer1);
        observable.setState(20);
        observable.setState(30);

        System.out.println(">>> Observer Pull <<<");

        ObservablePullImpl obs = new ObservablePullImpl();
        ObserverPull obs1 = new ObserverPullImpl1();
        ObserverPull obs2 = new ObserverPullImpl2();
        obs.subscribe(obs1);
        obs.subscribe(obs2);
        obs.setState(10);
        obs.setState(20);
        obs.unsubscribe(obs1);
        obs.setState(30);
        obs.setState(40);
    }
}
