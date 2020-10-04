package GameObjects;

import java.awt.*;

public abstract class GameObject implements Drawable {

    private int xPosition;
    private int yPostion;
    private Color color;

    public GameObject(int xPosition, int yPosition, Color color) {
        this.xPosition = xPosition;
        this.yPostion = yPosition;
        this.color = color;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPostion() {
        return yPostion;
    }

    public void setyPostion(int yPostion) {
        this.yPostion = yPostion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isColliding(GameObject other) {
        return this.getBounds().intersects(other.getBounds());
    }

    public abstract Rectangle getBounds();

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
    }
}
