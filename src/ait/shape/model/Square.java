package ait.shape.model;

public class Square extends Shape{
    public Square(double side) {
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
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append('}');
        return sb.toString();
    }
}
