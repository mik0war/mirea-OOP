package Task1;

public class Square extends Rectangle {

    public Square()
    {
        super();
    }

    public Square(double side){
        this.width = side;
        this.length = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side){
        setSide(side);
    }

    @Override
    public void setLength(double side){
        setSide(side);
    }

    @Override
    public String toString() {
        return color + " square with side = " + length;
    }
}
