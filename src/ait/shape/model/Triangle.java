package ait.shape.model;

public class Triangle extends Shape{
    public Triangle(double side) {
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
        final StringBuilder sb = new StringBuilder("Triangle{");
        sb.append('}');
        return sb.toString();
    }
}
