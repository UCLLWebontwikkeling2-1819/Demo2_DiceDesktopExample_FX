import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DiceUI_FX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 300,250);

        new DiceGUI(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Dice Desktop Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
