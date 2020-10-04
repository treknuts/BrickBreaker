package GameObjects;

import java.awt.*;

public class Ball extends MovingGameObject {

    private int diameter;

    public Ball(int xPosition, int yPosition, int xVelocity, int yVelocity, int diameter, Color color) {
        super(xPosition, yPosition, xVelocity, yVelocity, color);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.fillOval(super.getxPosition(), super.getyPostion(), this.diameter, this.diameter);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(super.getxPosition(), super.getyPostion(), this.getDiameter(), this.getDiameter());
    }
}
