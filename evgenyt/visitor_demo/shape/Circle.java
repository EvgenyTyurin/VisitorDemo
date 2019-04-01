package evgenyt.visitor_demo.shape;

import evgenyt.visitor_demo.visitor.Visitor;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
