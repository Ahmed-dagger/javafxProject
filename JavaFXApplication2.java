import javafx.stage.Stage;
import javafx.animation.FadeTransition;
import javafx.scene.Scene;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.util.Duration;


public class JavaFXApplication2 extends Application {
@Override
public void start(Stage primaryStage) {
GridPane pane = new GridPane();
pane.setHgap(10);
pane.setVgap(10);
pane.setPadding(new Insets(20));
Label l1 = new Label("User Name: ");
Label l2 = new Label("Password: ");
TextField tf1 = new TextField();
TextField tf2 = new TextField();

tf1.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                tf1.setStyle("-fx-focus-color: red;");
            } else {
                tf1.setStyle("-fx-focus-color: blue;");
            }
        });

tf2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                tf2.setStyle("-fx-focus-color: red;");
            } else {
                tf2.setStyle("-fx-focus-color: blue;");
            }
        });
Button b1 = new Button("Login");
b1. setStyle("-fx-background-color: #ff0000;"
        + " -fx-text-fill: #ffffff ;"
        + "-fx-border-raduis:15px;  "
        + "-fx-background-radius: 5em; " +
                "-fx-min-width: 30px; " +
                "-fx-min-height: 30px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;");

b1.setOnMouseEntered(e->{b1.setStyle("-fx-background-color: #000000;"+ " -fx-text-fill: #ff0000 ;"+ "-fx-background-radius: 5em; " +
                "-fx-min-width: 30px; " +
                "-fx-min-height: 30px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;"  );});
 b1.setOnMouseExited(e -> {
            b1.setStyle("-fx-background-color: #ff0000;"+ " -fx-text-fill: #000000 ;" + "-fx-background-radius: 5em; " +
                "-fx-min-width: 30px; " +
                "-fx-min-height: 30px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;");
        });
 

pane.add(l1, 0, 0);
pane.add(tf1, 1, 0);
pane.add(l2, 0, 1);
pane.add(tf2, 1, 1);
pane.add(b1, 1, 2);
GridPane.setHalignment(b1, HPos.CENTER);
Scene s1 = new Scene(pane);
primaryStage.setTitle("GridPane");
primaryStage.setScene(s1);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}