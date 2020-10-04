package GameObjects;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class Paddle extends ControlledGameObject implements Moveable {

    private int width;
    private int height;
    private int xVelocity;

    public Paddle(int xPosition, int yPosition, int width, int height, int xVelocity, Color color, KeyboardController controller) {
        super(xPosition, yPosition, color, controller);
        this.width = width;
        this.height = height;
        this.xVelocity = xVelocity;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            setxVelocity(3);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            setxVelocity(-3);
        }
    }

    @Override
    public void move() {
        super.setxPosition(super.getxPosition() + this.getxVelocity());
    }
}
