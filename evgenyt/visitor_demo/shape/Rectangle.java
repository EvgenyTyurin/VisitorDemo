package evgenyt.visitor_demo.shape;

import evgenyt.visitor_demo.visitor.Visitor;

public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
