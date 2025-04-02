// Imports for the CircleController class
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

// CircleController Class header
public class CircleController extends Application {

    /**
     * (start) method that instantiates a new MainPane Object
     * and a Scene object, that adds the MainPane and sets the size of the window displayed
     */
    public void start(Stage stage){
        MainPane mp = new MainPane();
        Scene scene = new Scene(mp, 400, 400);

        stage.setScene(scene);
        stage.setTitle("Circle Controller");
        stage.show();
    }

    // Main method to launch the Application
    public static void main(String[] args){
        launch(args);
    }
}