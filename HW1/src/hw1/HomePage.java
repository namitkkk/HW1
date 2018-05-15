/*
By: Stavros Kontzias and Namit Kumar
HVAC IS Application
This CDF serves as the landing page for the application
 */
package hw1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HomePage extends Application {
    Label lblHello;
    ComboBox userCombo;
    Label lblSelectUser;
    Button btnContinue;
    GridPane pane;
    
    ImageView imgHVAC;

    @Override
    public void start(Stage primaryStage) {
        
        
        pane = new GridPane();
        pane.setAlignment(Pos.CENTER);       
        pane.setVgap(5);
        pane.setHgap(5);
        
        
        imgHVAC = new ImageView(new Image("file:src/Project/img/logo.png"));
        imgHVAC.setFitWidth(150);
        imgHVAC.setFitHeight(100);
    }   
    public static void main(String[] args) {
        launch(args);
    }
    
}
