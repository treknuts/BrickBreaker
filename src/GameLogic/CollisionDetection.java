package GameLogic;

import GameObjects.Ball;
import GameObjects.Brick;
import GameObjects.Paddle;

public class CollisionDetection {

    public static boolean ballBrickCollision(Brick brick, Ball ball) {
        if (ball.isColliding(brick)) {
            ball.setyVelocity(-ball.getyVelocity());
            brick = null;
            return true;
        }
        return false;
    }

    public static void ballPaddleCollision(Ball ball, Paddle paddle) {
        if (ball.isColliding(paddle)) {
            ball.setyVelocity(-ball.getyVelocity());
        }
    }
}
