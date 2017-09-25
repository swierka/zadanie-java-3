public class Square {
    double sideSquare;

    double showSquarePerimeter (){
        ShapeCalculator sqA = new ShapeCalculator();
        return sqA.squareArea(this);
    }
}
