import GameObjects.Ball;
import GameObjects.Brick;
import GameObjects.KeyboardController;
import GameObjects.Paddle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Game extends JPanel {

    private ArrayList<Brick> brickList = new ArrayList<>();
    private Ball ball = new Ball(610, 790, 0, -2, 20, Color.red);
    private KeyboardController controller = new KeyboardController();
    private Paddle paddle = new Paddle(610, 780, 40, 10, 0, Color.GREEN, controller);

    public void moveBall() {
        ball.move();
    }

    public Ball getBall() {
        return this.ball;
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
        setBrickList();
        super.paint(g);
        for (Brick brick : brickList) {
            brick.draw(g);
        }
        ball.draw(g);
    }

//    public static void main(String[] args) throws InterruptedException {
//        JFrame window = new JFrame("BrickBreaker!");
//        Game game = new Game();
//        game.setBackground(Color.DARK_GRAY);
//        window.add(game);
//        window.setPreferredSize(new Dimension(1220, 800));
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.setResizable(true);
//        window.setVisible(true);
//        window.pack();
//
//        while (true) {
//            game.moveBall();
//
//            // TODO: Move this into a GameLogic file. Also, getting an Exception when the ball goes back down.
//            for (Brick b : game.brickList) {
//                if (game.ball.isColliding(b)) {
//                    game.brickList.remove(b);
//                    game.ball.setyVelocity(-game.ball.getyVelocity());
//                    break;
//                }
//            }
//            game.repaint();
//            Thread.sleep(10);
//        }
//
//    }
}
