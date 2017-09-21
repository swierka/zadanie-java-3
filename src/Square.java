public class Square {
    double sideSquare;

    void showSquarePerimeter (Square sq){
        ShapeCalculator sqA = new ShapeCalculator();
        double showSquarePerimeter=sqA.squareArea(sq);
        System.out.println(showSquarePerimeter);
    }
}
