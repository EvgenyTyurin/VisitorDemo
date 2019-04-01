package evgenyt.visitor_demo.visitor;

import evgenyt.visitor_demo.shape.Circle;
import evgenyt.visitor_demo.shape.Rectangle;

/**
 * Can check point for inbounds of any figure
 */

public class BoundsChecker implements Visitor{
    private int checkX, checkY;
    private boolean inbounds = false;

    public BoundsChecker(int checkX, int checkY) {
        this.checkX = checkX;
        this.checkY = checkY;
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        inbounds = checkX >= rectangle.getX() &&
            checkX <= rectangle.getX() + rectangle.getWidth() &&
            checkY >= rectangle.getY() &&
            checkY <= rectangle.getY() + rectangle.getHeight();
    }

    @Override
    public void visitCircle(Circle circle) {
        inbounds = circle.getRadius() >=  Math.sqrt(Math.pow(checkY - circle.getX(), 2) +
            Math.pow(checkY - circle.getY(), 2));
    }

    public boolean isInbounds() {
        return inbounds;
    }
}
