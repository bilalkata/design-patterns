package ma.enset.strategies;

import ma.enset.Strategy;

public class StrategyImpl1 implements Strategy {
    @Override
    public void perform() {
        System.out.println( "Performing Strategy 1");
    }
}
