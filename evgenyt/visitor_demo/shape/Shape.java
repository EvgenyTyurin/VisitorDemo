package evgenyt.visitor_demo.shape;

import evgenyt.visitor_demo.visitor.Visitor;

/**
 * Any shape must accept visitors
 */

public abstract class Shape {
    private int x,y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract public void accept(Visitor visitor);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
