package ma.enset.strategies;

import ma.enset.Strategy;

public class DefaultStrategyImpl implements Strategy {
    @Override
    public void perform() {
        System.out.println( "Performing Default Strategy");
    }
}
