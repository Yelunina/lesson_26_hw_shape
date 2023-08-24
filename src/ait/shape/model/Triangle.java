package ait.shape.model;

public class Triangle extends Shape{
    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return side * side * Math.sqrt(3) / 4;
    }

    @Override
    public double calcPerimeter() {
        return 3*4;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Triangle{");
        sb.append('}');
        return sb.toString();
    }
}
