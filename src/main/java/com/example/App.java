package com.example;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

/**
 * JavaFX App.
 */
public class App extends Application {

    /**
     * The main scene of this app.
     */
    private static Scene scene;

    @Override
    public final void start(final Stage stage) throws IOException {
        //GridRestricted root = new GridRestricted();
        Pane root = new Pane();
        scene = new Scene(root, 300, 400);

        // root.setHgap(2);
        // root.setVgap(2);

        Block block = new Block(root, 1);
        Block secondBlock = new Block(root, 14);

        Hole hole = new Hole(16);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(final KeyEvent event) {
                switch (event.getCode()) {
                    case UP:
                        hole.moveUp();
                        break;
                    case DOWN:
                        //hole.moveDown();
                        break;
                    case LEFT:
                    default:
                        break;
                }
            }
        });


        stage.setScene(scene);
        stage.show();

    }


    /**
     * @param args standard arguments for any java app
     */
    public static void main(final String[] args) {
        launch();
    }


}
