public class Rectangle {
    double side1Rectangle;
    double side2Rectangle;

    Rectangle(double side1Rectangle, double side2Rectangle){
        this.side1Rectangle = side1Rectangle;
        this.side2Rectangle= side2Rectangle;
    }

    void showPerimeterRectangle (){
        ShapeCalculator rectP = new ShapeCalculator();
        System.out.println(rectP);
    }

}
