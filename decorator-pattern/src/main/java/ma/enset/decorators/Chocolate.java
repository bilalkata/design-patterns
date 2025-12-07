package ma.enset.decorators;

import ma.enset.drinks.Drink;

public class Chocolate extends DrinkDecorator {

    public Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return 2.00 + drink.cost();
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Chocolate";
    }
}
