// Project: Whack-A-Mole Game
// Author: Susan Rogers
// Date: December 2, 2025
// Description: The ScoreTracker class is responsible for keeping track of the player's score
// during the Whack-A-Mole game.
************************************************************************************************
public class ScoreTracker {
 // Current score
    private int score;

    /**
     * Default constructor initializes score to zero.(stub)
     */
    public ScoreTracker() {
        this.score = 0;
    }

    /**
     * Called when the player successfully whacks a mole. Adds 2 points per hit(stub)
     * (adjust if desired).
     */
    public void hit() {
        score += 2;
    }

    /**
     * Called when the player misses. Subtracts 1 point per miss, but never
     * below zero.(stub)
     */
    public void miss() {
        if (score > 0) {
            score -= 1;
        }
    }

    /**
     * @return the current score value.(stub)
     */
    public int getScore() {
        return score;
    }

    /**
     * Resets score to zero for a new game.(stub)
     */
    public void reset() {
        score = 0;
    }

    @Override
    public String toString() {
        return "Score: " + score;
    }
}
    
}

