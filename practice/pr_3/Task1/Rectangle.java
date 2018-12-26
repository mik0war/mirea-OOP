package Task1;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle()
    {
        this.color = "Red";
        this.filled = false;
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.color = "Red";
        this.filled = false;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2*(length + width);
    }

    @Override
    public String toString() {
        return color + " rectangle with width = " + width + " and length = " + length;
    }
}
