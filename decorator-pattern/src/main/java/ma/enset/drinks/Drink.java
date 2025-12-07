package ma.enset.drinks;

public abstract class Drink {

    protected String description;

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
