package Ball;

public class Ball {

    private double radius;
    private String type;
    private String color;

    public Ball() {
        this.color = "Blue";
        this.radius = 1.0;
        this.type = "football";
    }

    public Ball(double radius) {
        this.radius = radius;
        this.type = "football";
        this.color = "Blue";
    }

    public Ball(String type) {
        this.type = type;
        this.color = "Blue";
        this.radius = 1.0;
    }

    public Ball(double radius, String type, String color) {
        this.radius = radius;
        this.type = type;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return type + " ball, color is " + color + ", radius is " + radius;
    }
}
