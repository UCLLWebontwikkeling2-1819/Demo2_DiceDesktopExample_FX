import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.util.Random;


public class DiceGUI {

    // GUI has two buttons and one text field
    private Text answer=new Text();
    private final Button play = new Button("Play Dice");
    private final Button quit = new Button("Quit");

    public DiceGUI(GridPane root) {
        setupPane(root);

        customExitButton(quit);

        //add event to button play
        play.setOnAction(event ->
                {
                    int eyes = new Random().nextInt(6) + 1;
                    String message = "You threw a " + eyes;
                    answer.setText(message);
                }

                );

        addNodesToRoot(root);


    }

    private void addNodesToRoot(GridPane root) {
        // add nodes to root
        root.add(play, 0, 0);
        root.add(quit,2,2);
        quit.setAlignment(Pos.BASELINE_RIGHT);
        root.add(answer, 0, 1,2,1);
    }

    private void customExitButton(Button quit) {
        // add event to button quit
        this.quit.setOnAction(event ->
                Platform.exit()
        );
    }

    private void setupPane(GridPane root) {
        // setup pane
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setVgap(15);
        root.setHgap(15);
    }
}
