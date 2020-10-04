import GameObjects.Brick;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Game extends JPanel {

    ArrayList<Brick> brickList = new ArrayList<>();

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

    @Override
    public void paint(Graphics g) {
        setBrickList();
        super.paint(g);
        for (Brick brick : brickList) {
            brick.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("BrickBreaker!");
        Game game = new Game();
        window.setPreferredSize(new Dimension(1220, 800));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setBackground(Color.DARK_GRAY);
        window.add(game);
        window.setResizable(true);
        window.pack();
        window.setVisible(true);

    }
}
