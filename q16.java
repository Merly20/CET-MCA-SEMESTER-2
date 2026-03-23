import graphics.*;

public class q16 {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(6, 3);
        Circle circle = new Circle(7);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}