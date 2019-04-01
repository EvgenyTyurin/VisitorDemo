package evgenyt.visitor_demo;

import evgenyt.visitor_demo.shape.Circle;
import evgenyt.visitor_demo.shape.Rectangle;
import evgenyt.visitor_demo.visitor.BoundsChecker;

/**
 * Visitor pattern demo
 * Apr 2019 Evgeny Tyurin
 *
 * We have shapes (Circle, Rectangle) and visitor (BoundsCheck) that can
 * check point for inbound of any shape.
 */

public class VisitorDemo {
    /** Run point */
    public static void main(String[] args) {
        BoundsChecker boundsChecker = new BoundsChecker(50, 50);
        Rectangle rectangle = new Rectangle(0, 0, 100, 100);
        rectangle.accept(boundsChecker);
        System.out.println("Check rectangle inbound: " + boundsChecker.isInbounds());
        Circle circle = new Circle(0, 0, 10);
        circle.accept(boundsChecker);
        System.out.println("Check circle inbound: " + boundsChecker.isInbounds());
    }
}
