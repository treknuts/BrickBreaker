package GameObjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Game extends JPanel {
    private ArrayList<Brick> brickList;
    private final Ball ball;
    private final Paddle paddle;
    private final KeyboardController controller;

    public Game() {
        this.brickList = new ArrayList<>();
        this.ball = new Ball(610, 625, 3, -3, 20, Color.red);
        this.controller = new KeyboardController(this);
        this.addKeyListener(controller);
        this.setFocusable(true);
        this.paddle = new Paddle(590, 750, 80, 10, 0, Color.GREEN, controller);
    }

    public KeyboardController getController() {
        return this.controller;
    }

    public void moveBall() { ball.move(); }

    public void movePaddle() { paddle.move(); }

    public Ball getBall() {
        return this.ball;
    }

    public Paddle getPaddle() {
        return this.paddle;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.paddle.setxVelocity(5);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.paddle.setxVelocity(-5);
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.paddle.setxVelocity(0);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.paddle.setxVelocity(0);
        }
    }

    public void setBrickList() {
        int startX = 100;
        int startY = 75;
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 12; k++) {
                brickList.add(new Brick(startX, startY, 80, 40, Color.GREEN));
                startX += 85;
            }
            startX = 100;
            startY += 45;
        }
    }

    public ArrayList<Brick> getBrickList() {
        return this.brickList;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Brick brick : brickList) {
            brick.draw(g);
        }
        paddle.draw(g);
        ball.draw(g);
    }
}
