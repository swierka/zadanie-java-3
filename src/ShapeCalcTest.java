public class ShapeCalcTest {
    public static void main(String[] args) {
        ShapeCalculator Square = new ShapeCalculator();
        Square square1 = new Square();
        square1.sideSquare = 17;;
        double showSquare = Square.squareArea(square1);

        ShapeCalculator Circle = new ShapeCalculator();
       Circle circle1 = new Circle();
       circle1.radius = 5.7;
       double showCircle = Circle.circleArea(circle1);

       ShapeCalculator Triangle = new ShapeCalculator();
       Triangle triangle1 = new Triangle(5,6,4.5);
       double showTriangle = Triangle.trianglePerimeter(triangle1);

       ShapeCalculator  Rectangle = new ShapeCalculator();
       Rectangle rectangle1 = new Rectangle(5.6,8.5);
       double showRectangle = Rectangle.rectPerimeter(rectangle1);

        System.out.println(showSquare);
        System.out.println(showCircle);
        System.out.println(showTriangle);
        System.out.println(showRectangle);

    }
}
