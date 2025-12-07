package ma.enset.drinks;

public class Espresso extends Drink {

    public Espresso() {
        super.description = "Espresso";
    }

    @Override
    public double cost() {
        return 12.00;
    }
}
