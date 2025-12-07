package ma.enset.decorators;

import ma.enset.drinks.Drink;

public class Caramel extends DrinkDecorator {

    public Caramel(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return 1.75 + drink.cost();
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Caramel";
    }

}
