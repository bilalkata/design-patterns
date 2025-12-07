package ma.enset;

import ma.enset.decorators.Caramel;
import ma.enset.decorators.Chocolate;
import ma.enset.decorators.Hazelnuts;
import ma.enset.drinks.Drink;
import ma.enset.drinks.Latte;

public class DecoratorDemo {

    static void main() {
        Drink drink;
        drink = new Latte();
        drink = new Chocolate(drink);
        drink = new Hazelnuts(drink);
        drink = new Hazelnuts(drink);
        drink = new Caramel(drink);
        System.out.println(drink.getDescription() + " $" + drink.cost());
    }
}
