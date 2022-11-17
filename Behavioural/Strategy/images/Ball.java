package images;

public class Ball {
	private int fallCounter = 0;
	
    public void incrementFallCounter() {this.fallCounter++;}

	/** Disable the ball from carrying out any operations and hide the ball */
	public void disable() {
		this.shape.setVisible(false);
		this.disabled = true;
	}

	/**
     * Get the number of times a ball has fell into a pocket.
     * @return The number of times a ball has fell into a pocket
     */
    public int getFallCounter() {return this.fallCounter;}

	public void fallIntoPocket(Game game) {
        this.pocketAction.fallIntoPocket(game, this);
    }
}

/** An interface for the action carried out when a ball falls into a pocket */
interface BallPocketStrategy {
    /**
     * Action to execute when a ball fell into a pocket
     * @param game The instance of the game
     * @param ball The ball that this instance is associated to
     */
    public void fallIntoPocket(Game game, Ball ball);
}


class PocketOnce implements BallPocketStrategy {
    public void fallIntoPocket(Game game, Ball ball) {
        ball.disable();
    }
}

class PocketTwice implements BallPocketStrategy {
    private final int FALL_COUNTER_THRESHOLD = 2;

    public void fallIntoPocket(Game game, Ball ball) {
        ball.incrementFallCounter();
        if (ball.getFallCounter() >= FALL_COUNTER_THRESHOLD) {
            ball.disable();
        } else {
            ball.resetPosition();
            for (Ball ballB: game.getPoolTable().getBalls()) {
                if (ball.isColliding(ballB)) {
                    ball.disable();
                }
            }
        }
    }
}