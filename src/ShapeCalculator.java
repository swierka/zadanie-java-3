public class ShapeCalculator {

    double squareArea(Square square){
        return square.sideSquare*square.sideSquare;
    }

    double circleArea(Circle circle){
        return circle.radius*circle.radius*circle.pi;
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.side1Triangle+triangle.side2Triangle+triangle.side3Triangle;
    }

    double rectPerimeter(Rectangle rectangle){
        return (rectangle.side1Rectangle*2)+(rectangle.side2Rectangle*2);
    }

}
