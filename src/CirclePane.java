// Imports for CirclePane class
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

// CirclePane Class Header
public class CirclePane extends StackPane {

    // Private Fields
    private Circle circle;

    // CirclePane Class Constructor
    public CirclePane(){
        circle = new Circle();
        circle.setRadius(9);
        this.getChildren().add(circle);
    }

    // CirclePane Class Methods

    /**
     * The (enlarge) method adds a radius of 3 to the overall radius of the circle
     * however once the radius exceeds a value of 150, the radius is set and capped at 150
     */
    public void enlarge(){
        circle.setRadius(circle.getRadius() + 3);

        if (circle.getRadius() > 150){
            circle.setRadius(150);
        }
    }

    /**
     * The (shrink) method subtracts a radius of 3 from the overall radius of the circle
     * however once the radius goes under a value of 3, the radius is set at 3
     */
    public void shrink(){
        circle.setRadius(circle.getRadius() - 3);

        if (circle.getRadius() < 3){
            circle.setRadius(3);
        }
    }
}