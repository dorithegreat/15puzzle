package com.example;
import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class Block extends Rectangle {
    /**
     * Label displaying the block's number.
     */
    private Label number;

    /**
     * Current position of this block.
     */
    private int position;

    /**
     * GridPane used as a background.
     */
    //private GridRestricted backGrid;
    private Pane background;

    /**
     * the grid's hole.
     */
    private Hole hole;

    /**
     * arraylist to keep positions of all blocks in the grid.
     */
    private ArrayList<Node> positionsTab;

    /**
     * a constant setting the length of all sides of the blocks.
     */
    private final int squareSide = 70;

    /**
     * constructor.
     *
     * @param pane pane to be used as a background.
     * @param startingPosition the initial value of this Blocks position
     * @param list an arraylist keeping track of all blocks and their
     * current positions.
     */
    public Block(final Pane pane, final int startingPosition, ArrayList<Node> list) {
        ///*final GridRestricted grid*/
        position = startingPosition;
        positionsTab = list;

        //positionsTab.add(position, this);
        background = pane;
        this.setHeight(squareSide);
        this.setWidth(squareSide);

        System.out.println(position / 4);
        System.out.println(position % 4);

        if (position % 2 == 1) {
            this.setFill(Color.CORAL);
        } else {
            this.setFill(Color.CORNFLOWERBLUE);
        }

        background.getChildren().add(this);
        setX((position % 4) * squareSide);
        setY((position / 4) * squareSide);
        //grid.add(number, position / 4, position % 4);
        System.out.println("added");
    }

    /**
     * moves this block one square up.
     */
    public void moveUp() {
        setY(getY() - squareSide);
        position -= 4;
        System.out.println("block moved up");
    }

    /**
     * moves this block one square down.
     */
    public void moveDown() {
        setY(getY() + squareSide);
        position += 4;
        System.out.println("block moved down");
    }

    /**
     * moves this block one square left.
     */
    public void moveLeft() {
        setX(getX() - squareSide);
        position -= 1;
        System.out.println("block moved left");
    }

    /**
     * moves this block one square right.
     */
    public void moveRight() {
        setX(getX() + squareSide);
        position += 1;
        System.out.println("block moved right");
    }

}
