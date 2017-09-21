public class Circle {
    double radius;
    final double pi = 3.14159;

    void showCircleArea(Circle cir) {
        ShapeCalculator circleArea = new ShapeCalculator();
        double showCircleArea = circleArea.circleArea(cir);
        System.out.println(showCircleArea);
    }

}
