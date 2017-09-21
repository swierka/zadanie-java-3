public class Triangle {
    double side1Triangle;
    double side2Triangle;
    double side3Triangle;

    Triangle(double side1, double side2, double side3){
        this.side1Triangle = side1;
        this.side2Triangle = side2;
        this.side3Triangle = side3;
    }

    void showTrianPer(){
        ShapeCalculator TrianPer = new ShapeCalculator();
        System.out.println(TrianPer);

    }

}
