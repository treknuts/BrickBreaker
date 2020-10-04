package GameObjects;

import java.awt.*;

public abstract class ControlledGameObject extends GameObject implements Moveable {

    KeyboardController controller;

    public ControlledGameObject(int xPosition, int yPosition, Color color, KeyboardController controller) {
        super(xPosition, yPosition, color);
        this.controller = controller;
    }

}
