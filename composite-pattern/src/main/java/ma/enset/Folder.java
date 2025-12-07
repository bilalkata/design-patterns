package ma.enset;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    private final List<Component> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(tabs() + this.name);
        this.components.forEach(Component::print);
    }

    public Component add(Component component) {
        component.level = this.level + 1;
        this.components.add(component);
        return component;
    }
}
