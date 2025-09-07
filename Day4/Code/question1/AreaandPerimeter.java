package Day4.Code.question1;
import java.util.*;
import java.lang.Math;
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}


class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// shape.java
public class AreaandPerimeter {
    public static void main(String[] args) {
        // Rectangle
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Square
        Square square = new Square(6);
        System.out.println("\nSquare Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        // Circle
        Circle circle = new Circle(7);
        System.out.println("\nCircle Area: " + Math.round(circle.calculateArea()));
        System.out.println("Circle Perimeter: " + Math.round(circle.calculatePerimeter()));
    }
}
