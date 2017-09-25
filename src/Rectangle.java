import org.w3c.dom.css.Rect;

public class Rectangle {
    double side1Rectangle;
    double side2Rectangle;

    Rectangle(double side1Rectangle, double side2Rectangle){
        this.side1Rectangle = side1Rectangle;
        this.side2Rectangle= side2Rectangle;
    }

    double showPerimeterRectangle () {
        ShapeCalculator rectP = new ShapeCalculator();
        return rectP.rectPerimeter(this);
    }

}
