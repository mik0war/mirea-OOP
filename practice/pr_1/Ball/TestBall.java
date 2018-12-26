package Ball;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {

        Ball ball1 = new Ball();
        System.out.println(ball1.toString());

        Ball ball2 = new Ball(1.5);
        ball2.setColor("Red");
        ball2.setType("Volleyball");
        System.out.println(ball2.toString());

        Ball ball3 = new Ball(2, "basketball", "orange");
        System.out.println(ball3.getType() + " ball, color: " + ball3.getColor() + ", radius: " + ball3.getRadius());

    }
}
