package evgenyt.visitor_demo.visitor;

import evgenyt.visitor_demo.shape.Circle;
import evgenyt.visitor_demo.shape.Rectangle;

/**
 * Visitors must have methods to work with circles and rectangles
 */

public interface Visitor {
    void visitRectangle(Rectangle rectangle);
    void visitCircle(Circle circle);
}
