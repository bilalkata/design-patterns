package ma.enset.decorators;

import ma.enset.drinks.Drink;

public class Hazelnuts extends DrinkDecorator {

    public Hazelnuts(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return 2.25 + drink.cost();
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Hazelnuts";
    }

}
