package GameObjects;

import java.awt.*;

public class Paddle extends ControlledGameObject implements Moveable {

    private final int width;
    private final int height;
    private int xVelocity;

    public Paddle(int xPosition, int yPosition, int width, int height, int xVelocity, Color color, KeyboardController controller) {
        super(xPosition, yPosition, color, controller);
        this.width = width;
        this.height = height;
        this.xVelocity = xVelocity;
    }

    public int getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.fillRect(super.getxPosition(), super.getyPostion(), this.width, this.height);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(super.getxPosition(), super.getyPostion(), this.width, this.height);
    }

    @Override
    public void move() {
        this.setxPosition(this.getxPosition() + this.getxVelocity());
    }
}
