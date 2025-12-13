/************************
* Project: WhackAMoleGame
* File: WhackAMole.java
* Author: Jacob Clark
* Date: 12/3/2025
* Description: This program is a simple game of Whack-A-Mole.
***********************************************************/

public class WhackAMole {

    //Tracks player's score
    private ScoreTracker score;
    
    //Shows game board grid
    private GameBoard board;

    //Tracks game timer and difficulty
    private GameTimer timer;

    //Reads user input
    private Scanner scanner;

    //Generates random mole positions
    private Random random;

    //Constructor stub, sets up game.
    public WhackAMole() {
    }

    //Sets up gamw with given dimensions and time limit
    oublic WhackAMole(int rows, int columns, int seconds) {
    }

    //Starts game
    public void startGame() {
    }

    //Set score tracker
    public void setScore(ScoreTracker score) {
        this.score = score;
    }

    //Get score tracker
    public ScoreTracker getScore() {
        return score;
    }

    //Set game board
    public void setBoard(GameBoard board) {
        this.board = board;
    }

    //Get game board
    public GameBoard getBoard() {
        return board;
    }

    //Set game timer
    public void setTimer(GameTimer timer) {
        this.timer = timer;
    }

    //Get game timer
    public GameTimer getTimer() {
        return timer;
    }

    //Main method
    public static void main(String[] args) {
    }

}
