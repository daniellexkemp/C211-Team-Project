/******************************************************
 * Project: WhackAMoleGame
 * Author: Nathan Johnson
 * Date: December 2, 2025
 * Purpose: Maintains a 2D board for Whack-A-Mole.
 ******************************************************/

import java.util.ArrayList;
import java.util.Random;

public class GameBoard {

    // ----- Instance Variables Stub -----
    private int rows;
    private int cols;
    private char[][] grid;
    private Random rng;
    private int moleCount;
    private ArrayList<int[]> moles;

    // ----- Constructor -----
    public GameBoard(int r, int c) {
        // stub
    }

    // ----- Public Methods -----

    public void reset() {
        // stub 
    }

    public void spawnMoles(int moleCount) {
        // stub 
    }

    public boolean whackAt(int r, int c) {
        // stub – return placeholder
        return false;
    }

    public int getRows() {
        // stub – return placeholder
        return 0;
    }

    public int getColumns() {
        // stub – return placeholder
        return 0;
    }

    public int getMoleCount() {
        // stub – return placeholder
        return 0;
    }

    @Override
    public String toString() {
        // stub – return placeholder string
        return "";
    }

    // ----- Private Helper Method -----

    private boolean inBounds(int r, int c) {
        // stub – return placeholder
        return false;
    }
}


