package ait.shape.model;

public class Circle extends Shape{

    public Circle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return 0;
    }

    @Override
    public double calcPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append('}');
        return sb.toString();
    }
}
