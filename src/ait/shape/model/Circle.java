package ait.shape.model;

public class Circle extends Shape{

    public Circle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return side*side*Math.PI;
    }

    @Override
    public double calcPerimeter() {
        return 2*side*Math.PI;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append('}');
        return sb.toString();
    }
}
