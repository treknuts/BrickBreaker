import GameLogic.CollisionDetection;
import GameObjects.*;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        JFrame window = new JFrame("BrickBreaker!");
        Game game = new Game();
        game.setBackground(Color.DARK_GRAY);
        game.setBrickList();
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

            try {
                for (Iterator<Brick> i = game.getBrickList().iterator(); i.hasNext();) {
                    if (CollisionDetection.ballBrickCollision(i.next(), game.getBall())) {
                        i.remove();
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            CollisionDetection.ballPaddleCollision(game.getBall(), game.getPaddle());
            CollisionDetection.ballWindowCollision(game, game.getBall());
            game.removeAll();
            game.revalidate();
            game.repaint();
            Thread.sleep(10);
        }

    }
}
