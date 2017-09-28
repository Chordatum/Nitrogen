/**
 * Just used to test things; Libraries shouldn't be applications
 */

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene primaryScene = new Scene(root);
        primaryStage.setScene(primaryScene);

        new AnimationTimer()  {
            public void handle(long currentNanoTime) {

            }
        }.start();
        primaryStage.show();
    }
}
