// Imports for MainPane
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

// MainPane Class Header
public class MainPane extends BorderPane {

    // Private Fields
    private CirclePane circlePane;
    private Button enlargeButton;
    private Button shrinkButton;

    // MainPane Class Constructor
    public MainPane(){

        /**
         * A CirclePane Object is instantiated
         * Then two new buttons are given ("Enlarge" and "Shrink") as text labels
         *
         * Then an HBox Object is instantiated which is what is used to add the Buttons
         * onto at the bottom using the (setBottom) function
         *
         */
        circlePane = new CirclePane();
        enlargeButton = new Button("Enlarge");
        shrinkButton = new Button("Shrink");
        HBox cmdPane = new HBox();

        /**
         * This function uses a (setOnAction) method by linking it to the enlargeButton
         * to then enlarge the Circle by using an 'enlarge()' function on the CirclePane
         */
        enlargeButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                circlePane.enlarge();
            }
        });

        // Lambda function expression for the (enlargeButton)
//        enlargeButton.setOnAction( event -> {
//            circlePane.enlarge();
//        });

        /**
         * This function uses a (setOnAction) method by linking it to the shrinkButton
         * to then shrink the Circle by using an 'shrink()' function on the CirclePane
         */
        shrinkButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                circlePane.shrink();
            }
        });

        // Lambda function expression for the (shrinkButton)
//        shrinkButton.setOnAction(event -> {
//            circlePane.shrink();
//        });

        /**
         * Centers the circlePane and adds of the Buttons to the HBox
         * and sets the HBox (cmdPane) to the bottom
         */
        this.setCenter(circlePane);
        cmdPane.getChildren().addAll(enlargeButton, shrinkButton);
        this.setBottom(cmdPane);
    }

}
