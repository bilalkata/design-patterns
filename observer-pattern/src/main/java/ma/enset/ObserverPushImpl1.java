package ma.enset;


import ma.enset.observers.ObserverPush;

public class ObserverPushImpl1 implements ObserverPush {
    @Override
    public void update(int state) {
        System.out.println( "Observer 1 received state: " + state);
    }
}
