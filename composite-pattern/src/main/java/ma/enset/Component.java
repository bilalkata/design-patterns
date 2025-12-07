package ma.enset;

public abstract class Component {

    protected String name;
    protected int level;

    public Component(String name) {
        this.name = name;
        this.level = 0;
    }

    protected abstract void print();

    protected String tabs() {
        return "\t".repeat(Math.max(0, this.level));
    }
}
