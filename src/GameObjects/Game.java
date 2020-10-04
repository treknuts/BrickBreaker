package GameObjects;

import GameLogic.CollisionDetection;

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

    public ArrayList<Brick> getBrickList() {
        return brickList;
    }
}
