# Circle Controller

## Overview
Circle Controller is a simple JavaFX application that allows users to control the size of a circle by clicking "Enlarge" and "Shrink" buttons. The circle's radius is dynamically adjusted within a specified range.

## Features
- Graphical User Interface (GUI) built using JavaFX 23.0.1.
- Interactive buttons to enlarge or shrink the circle.
- Circle size is capped at a maximum radius of 150 and a minimum radius of 3.
- Utilizes JavaFX layout management with `StackPane`, `BorderPane`, and `HBox`.

## Technologies Used
- **Java** (Version 23.0.1)
- **JavaFX** (Version 23.0.1)

## Project Structure
```
CircleController.java    # Main application class
CirclePane.java          # Custom pane containing the Circle object
MainPane.java            # Layout management and button handling
```

## Installation & Running the Project
### Prerequisites
- Java Development Kit (JDK) 23.0.1
- JavaFX SDK 23.0.1

### Steps to Run
1. Ensure Java and JavaFX are installed on your system.
2. Clone the repository:
   ```sh
   git clone https://github.com/your-username/circle-controller.git
   cd circle-controller
   ```
3. Compile and run the program using the following command:
   ```sh
   javac --module-path /path-to-javafx/lib --add-modules javafx.controls CircleController.java
   java --module-path /path-to-javafx/lib --add-modules javafx.controls CircleController
   ```

## Usage
- Click the **Enlarge** button to increase the circle's size by 3 units.
- Click the **Shrink** button to decrease the circle's size by 3 units.
- The circle's radius is restricted to a range of 3 to 150 units.

## Future Improvements
- Add color-changing functionality.
- Implement keyboard shortcuts for resizing.
- Enhance UI with additional styling.

## License
This project is open-source and available under the MIT License.

## Author
Developed by [Jcodes101].

