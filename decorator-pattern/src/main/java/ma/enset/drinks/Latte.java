package ma.enset.drinks;

public class Latte extends Drink {

    public Latte() {
        super.description = "Latte";
    }

    @Override
    public double cost() {
        return 18.00;
    }
}
