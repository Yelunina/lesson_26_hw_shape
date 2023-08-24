package ait.shape.model;
//Create an abstract class Shape with field side type double and an abstract methods calcArea and calcPerimeter.
// Create classes Circle, Triangle, Square which extends class Shape and implements abstract methods.
// Write class FigureAppl with method main. In method create array of Shapes. Add to array two circles, one triangle and one square. Calculate total area and total perimeter of all figures from array of Shapes.
// Calculate total area of circles. (*)
// P.S. We are bear in mind regular shapes
public abstract class Shape {
    protected double side;

    public Shape(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape{");
        sb.append("side=").append(side);
        sb.append('}');
        return sb.toString();
    }
}
