package GameObjects;

import java.awt.*;

public abstract class MovingGameObject extends GameObject implements Moveable {
    private int xVelocity;
    private int yVelocity;

    public MovingGameObject(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color) {
        super(xPosition, yPosition, color);
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
    }

    public int getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    public abstract Rectangle getBounds();

    public void draw(Graphics g) {
        super.draw(g);
    }

    @Override
    public void move() {
        super.setxPosition(super.getxPosition() + this.getxVelocity());
        super.setyPostion(super.getyPostion() + this.getyVelocity());
    }
}
