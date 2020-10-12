package GameLogic;

import GameObjects.Ball;
import GameObjects.Brick;
import GameObjects.Game;
import GameObjects.Paddle;

public class CollisionDetection {

    public static boolean ballBrickCollision(Brick brick, Ball ball) {
        if (ball.isColliding(brick)) {
            ball.setyVelocity(-ball.getyVelocity());
            return true;
        }
        return false;
    }

    public static void ballPaddleCollision(Ball ball, Paddle paddle) {
        if (ball.isColliding(paddle)) {
            ball.setyVelocity(-ball.getyVelocity());
        }
    }

    public static void ballWindowCollision(Game game, Ball ball) {
        if (ball.getyPostion() <= 0) {
            ball.setyVelocity(-ball.getyVelocity());
        } else if (ball.getxPosition() <= 0 || ball.getxPosition() + ball.getDiameter() >= game.getWidth()) {
            ball.setxVelocity(-ball.getxVelocity());
        }
    }
}
