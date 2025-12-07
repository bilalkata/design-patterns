package ma.enset;

import ma.enset.strategies.DefaultStrategyImpl;

public class Context {

    private Strategy strategy = new DefaultStrategyImpl();
    public void apply() {
        strategy.perform();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
