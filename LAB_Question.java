package package_eg;

//Abstract class Shape
abstract class Shape {
// Abstract method calculateArea
abstract double calculateArea();
}

//Circle class that extends Shape
class Circle extends Shape {
double radius;// Radius of the circle
double pi=3.14;

// Constructor for Circle class
Circle(double radius) {
   this.radius = radius;
}

// Implementing calculateArea method for Circle class
@Override
double calculateArea() {
   return (pi * radius * radius);
}
}

//Rectangle class that extends Shape
class Rectangle extends Shape {
double width; // Width of the rectangle
double height; // Height of the rectangle

// Constructor for Rectangle class
Rectangle(double width, double height) {
   this.width = width;
   this.height = height;
}

// Implementing calculateArea method for Rectangle class
@Override
double calculateArea() {
   return width * height;
}
}

public class LAB_Question {
public static void main(String[] args) {
   // Creating Circle object
   Circle c = new Circle(50);
   System.out.println("Area of Circle: " + c.calculateArea()); // Calling calculateArea method for Circle

   // Creating Rectangle object
   Rectangle r = new Rectangle(20, 30);
   System.out.println("Area of Rectangle: " + r.calculateArea()); // Calling calculateArea method for Rectangle
}
}