package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

/**
<<<<<<< HEAD
 * Test to mess with git.
=======
 * Test to mess with git.
>>>>>>> secondary
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
        scene = new Scene(root, 400, 400);

        ArrayList<Node> positionsTab = new ArrayList<Node>(16);

        for (int i = 0; i < 15; i++) {
            Block block = new Block(root, i, positionsTab);
            positionsTab.add(i, block);
        }

        Hole tempHole = new Hole(15, positionsTab);
        positionsTab.add(15, tempHole);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(final KeyEvent event) {
                System.out.println(event.getCode());
                switch (event.getCode()) {
                    case UP:
                        //System.out.println("UP key registered");
                        tempHole.moveUp();
                        break;
                    case DOWN:
                        //System.out.println("DOWN key registered");
                        tempHole.moveDown();
                        break;
                    case LEFT:
                        //System.out.println("LEFT key registered");
                        tempHole.moveLeft();
                        break;
                    case RIGHT:
                        //System.out.println("RIGHT key registered");
                        tempHole.moveRight();
                        break;
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
