package com.example;
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
     * constructor.
     *
     * @param pane pane to be used as a background.
     * @param startingPosition the initial value of this Blocks position
     */
    public Block(final Pane pane, final int startingPosition) {
        ///*final GridRestricted grid*/
        position = startingPosition;
        this.setHeight(30);
        this.setWidth(50);

        System.out.println(position / 4);
        System.out.println(position % 4);

        this.setFill(Color.CORAL);
        //background.getChildren().add(this);
        //grid.add(number, position / 4, position % 4);
        System.out.println("added");
    }


}
