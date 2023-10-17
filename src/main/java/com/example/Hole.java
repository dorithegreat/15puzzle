package com.example;

public class Hole {
    /**
     * position in the grid.
     */
    private int position;

    /**
     * constructor.
     *
     * @param startingPosition the number indicating starting position
     */
    public Hole(final int startingPosition) {
        this.position = startingPosition;
    }

    /**
     * getter for the position.
     * @return position of the hole in the grid.
     */
    public int getPosition() {
        return position;
    }

    /**
     * moves this hole one space up.
     */
    public void moveUp() {
        if (position > 4) {
            position -= 4;
            System.out.println("moved up");
        }
    }
}
