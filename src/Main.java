import GameLogic.CollisionDetection;
import GameObjects.*;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        JFrame window = new JFrame("BrickBreaker!");
        Game game = new Game();
        game.setBackground(Color.DARK_GRAY);
        window.add(game);
        window.addKeyListener(game.getController());
        window.setPreferredSize(new Dimension(1220, 800));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setVisible(true);
        window.pack();

        while (true) {
            game.moveBall();
            game.movePaddle();

            for (int j = 0; j < game.getBrickList().size(); j++) {
                if (game.getBrickList().get(j) != null && CollisionDetection.ballBrickCollision(game.getBrickList().get(j), game.getBall())) {
                    // TODO: remove brick once it has been hit
                    game.getBrickList().remove(game.getBrickList().get(j));
                    break;
                }
            }

            CollisionDetection.ballPaddleCollision(game.getBall(), game.getPaddle());
            game.removeAll();
            game.revalidate();
            game.repaint();
            Thread.sleep(10);
        }

    }
}
