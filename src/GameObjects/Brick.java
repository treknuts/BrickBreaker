package GameObjects;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.awt.*;

public class Brick extends GameObject {

    private int width;
    private int height;

    public Brick(int xPosition, int yPosition, int width, int height, Color color) {
        super(xPosition, yPosition, color);
        this.width = width;
        this.height = height;
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

    public void draw(Graphics g) {
        super.draw(g);
        g.fillRect(super.getxPosition(), super.getyPostion(), this.getWidth(), this.getHeight());
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(super.getxPosition(), super.getyPostion(), this.getWidth(), this.getHeight());
    }
}
