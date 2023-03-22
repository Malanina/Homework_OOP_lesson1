package task1;

import java.util.ArrayList;

public class GeoTree {
    ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }


    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void add(Person sister1, Person sister2) {
        tree.add(new Node(sister1, Relationship.sister, sister2));
        tree.add(new Node(sister2, Relationship.sister, sister1));
    }
    
}