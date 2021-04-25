public class Square extends Geometric {

     private double side;

     public Square(double s) {

          side = s;

     }

     public double getArea() {

          return side * side;

     }

     public double getPerimeter() {

          return 4 * side;

     }

}
