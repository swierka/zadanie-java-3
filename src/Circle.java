public class Circle {
    double radius;
    final double pi = 3.14159;

    double showCircleArea() {
        ShapeCalculator circleArea = new ShapeCalculator();
        return circleArea.circleArea(this);
    }

}
