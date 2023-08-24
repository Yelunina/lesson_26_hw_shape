package ait.shape;

import ait.shape.model.Circle;
import ait.shape.model.Shape;
import ait.shape.model.Square;
import ait.shape.model.Triangle;

//Create an abstract class Shape with field side type double and an abstract methods calcArea and calcPerimeter.
// Create classes Circle, Triangle, Square which extends class Shape and implements abstract methods.
// Write class FigureAppl with method main. In method create array of Shapes. Add to array two circles,
// one triangle and one square. Calculate total area and total perimeter of all figures from array of Shapes.
// Calculate total area of circles. (*)
// P.S. We are bear in mind regular shapes
public class FigureAppl {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[7];
        System.out.println(shapes.toString());
        shapes[0] = new Circle(100);
        shapes[1] = new Circle(150);
        shapes[2] = new Triangle(15);
        shapes[3] = new Square(10);

        printArray(shapes);
        double totalShapesArea = totalArea(shapes);
        double totalShapesPerimeter = totalPerimeter(shapes);
        System.out.println("Total area = " + totalShapesArea);
        System.out.println("Total perimeter = " + totalShapesPerimeter);
        double circleArea = totalCirclesArea(shapes);
        System.out.println("Total area of circles = " + circleArea);
    }

    private static double totalArea(Shape[] shapes) {
        double res = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                res += shapes[i].calcArea();
            }
        }
        return res;
    }

    private static double totalPerimeter(Shape[] shapes) {
        double res = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                res += shapes[i].calcPerimeter();
            }
        }
        return res;
    }

    private static double totalCirclesArea(Shape[] shapes) {
        double res = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                res += shapes[i].calcArea();
            }
        }
        return res;
    }

    private static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }
}


