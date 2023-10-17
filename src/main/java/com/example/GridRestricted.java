package com.example;

import javafx.scene.layout.GridPane;
import javafx.scene.Node;

public class GridRestricted extends GridPane {
    /**
     * constructor with no parameters.
     */
    public GridRestricted() {
        super();
    }

    /**
     * adds components up to a 4x4 grid.
     *
     * @param node any javafx node to be added to the grid.
     * @param position number between 1 and 16 signifying position in the grid.
     */
    public void add(final Node node, final int position) {
        if ((position > 0) && (position <= 16)) {
            super.add(node, position / 4 + 1, position % 4);
        }
    }
}
