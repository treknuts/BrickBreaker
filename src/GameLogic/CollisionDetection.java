package GameLogic;

import GameObjects.Ball;
import GameObjects.Brick;

import java.util.ArrayList;

public class CollisionDetection {

    public static boolean ballBrickCollision(Brick brick, Ball ball) {
        if (ball.isColliding(brick)) {
            ball.setyVelocity(-ball.getyVelocity());
            return true;
        }
        return false;
    }
}
