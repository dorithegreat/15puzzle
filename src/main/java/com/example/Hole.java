package com.example;

import java.util.ArrayList;
import java.util.Collections;

import javafx.scene.shape.Rectangle;
import javafx.scene.Node;

public class Hole extends Rectangle {
    /**
     * position in the grid.
     */
    private int position;

    /**
     * keeps track of positions of all blocks.
     */
    private ArrayList<Node> positionsTab;

    /**
     * constructor.
     *
     * @param startingPosition the number indicating starting position
     * @param list arraylis.
     */
    public Hole(final int startingPosition, final ArrayList<Node> list) {
        this.position = startingPosition;
        positionsTab = list;
    }

    /**
     * getter for the position.
     * @return position of the hole in the grid.
     */
    public int getPosition() {
        return position;
    }

    /**
     * moves an available block up into the current position of the hole.
     */
    public void moveUp() {
        if (position < 12) {
            int tempPosition = position;
            position += 4;
            System.out.println("moved up");
            Collections.swap(positionsTab, tempPosition, position);
            System.out.println("Swapped " + position + " and " + tempPosition);
            ((Block) positionsTab.get(tempPosition)).moveUp();
        }
    }

    /**
     * moves an available block down into the current position of the hole.
     */
    public void moveDown() {
        if (position > 3) {
            int tempPosition = position;
            position = position - 4;
            //System.out.println(position);
            Collections.swap(positionsTab, tempPosition, position);
            //System.out.println("Swapped " + position + " and " + tempPosition);
            ((Block) positionsTab.get(tempPosition)).moveDown();
            //System.out.println(positionsTab.toString());
            System.out.println("moved down");
        }
    }

    /**
     * moves an available block left into the current position of the hole.
     */
    public void moveLeft() {
        if (position % 4 < 3) {
            int tempPosition = position;
            position = position + 1;
            //System.out.println(position);
            System.out.println("moved left");
            Collections.swap(positionsTab, tempPosition, position);
            System.out.println("Swapped " + position + " and " + tempPosition);
            ((Block) positionsTab.get(tempPosition)).moveLeft();
            //System.out.println(positionsTab.toString());
        }
    }

    /**
     * moves an available block right into the current position of the hole.
     */
    public void moveRight() {
        if (position % 4 > 0) {
            int tempPosition = position;
            position = position - 1;
            //System.out.println(position);
            System.out.println("moved right");
            Collections.swap(positionsTab, tempPosition, position);
            System.out.println("Swapped " + position + " and " + tempPosition);
            ((Block) positionsTab.get(tempPosition)).moveRight();
            //System.out.println(positionsTab.toString());
        }
    }
}
