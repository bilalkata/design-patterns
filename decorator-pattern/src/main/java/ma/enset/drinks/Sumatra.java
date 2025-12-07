package ma.enset.drinks;

public class Sumatra extends Drink {

    public Sumatra() {
        super.description = "Sumatra";
    }

    @Override
    public double cost() {
        return 15.00;
    }
}
