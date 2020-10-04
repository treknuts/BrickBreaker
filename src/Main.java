import GameLogic.CollisionDetection;
import GameObjects.*;

import javax.swing.*;
import java.awt.*;

public class Main {

    private static Game game;

//
//    public void moveBall() {
//        this.ball.move();
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        game.setBrickList();
//        super.paint(g);
//        for (Brick b : game.getBrickList()) {
//            if (b != null) {
//                b.draw(g);
//            }
//        }
//        ball.draw(g);
//        paddle.draw(g);
//    }

    public static void main(String[] args) throws InterruptedException {
        JFrame window = new JFrame("BrickBreaker!");
        game = new Game();
        game.setBackground(Color.DARK_GRAY);
        window.add(game);
        window.setPreferredSize(new Dimension(1220, 800));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setVisible(true);
        window.pack();

        while (true) {
            game.moveBall();

            // TODO: Move this into a GameLogic/CollisionDetection
            //       file. Also, getting an Exception when the ball goes back down.
            for (int j = 0; j < game.getBrickList().size(); j++) {
                if (game.getBrickList().get(j) != null && CollisionDetection.ballBrickCollision(game.getBrickList().get(j), game.getBall())) {
                    game.getBrickList().remove(j);
                    break;
                }
            }
            game.removeAll();
            game.revalidate();
            game.repaint();
            Thread.sleep(10);
        }

    }
}
