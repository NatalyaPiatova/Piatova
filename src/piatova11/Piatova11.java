
package piatova11;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.NodeOrientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Piatova11 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage theStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                   Label secondLabel = new Label("sorry,but your game not found");
              
                StackPane secondaryLayout = new StackPane();
                Canvas screen = new Canvas (900,500);
            secondaryLayout.getChildren().add(screen);
 
                Scene secondScene = new Scene(secondaryLayout, 230, 100);
                GraphicsContext gc1 = screen.getGraphicsContext2D();
                //Image pic = new Image ("fon.jpg");
                //gc1.drawImage (pic,0,0);
                //secondaryLayout.getChildren().add(secondLabel);
 
                // New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Second Stage");
                newWindow.setScene(secondScene);
 
                // Set position of second window, related to primary window.
                newWindow.setX(theStage.getX() + 200);
                newWindow.setY(theStage.getY() + 100);
                secondLabel.getStylesheets().add("css/label.css");
                newWindow.show();
            }
        });
        theStage.setTitle("Понивиль");
        Group root = new Group();
        Scene theScene = new Scene(root);
        theStage.setScene(theScene);

        Canvas canvas = new Canvas(1000, 900);
        root.getChildren().add(canvas);

        
        btn.setText("В ПУТЬ!");
       
        btn.relocate(700, 350);
        Button exit = new Button();
        exit.setText("Выход");
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = (Stage) exit.getScene().getWindow();
                stage.close();
            }
        });
        root.getChildren().add(exit);
        exit.relocate(850, 350);
        // btn.setBackground(Background.EMPTY);
        root.getChildren().add(btn);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.PINK);
        gc.setStroke(Color.PURPLE);
        gc.setLineWidth(2);
        Font theFont = Font.font("French Script MT", FontWeight.BOLD , 48);
        gc.setFont(theFont);
        Image pic2 = new Image("fon.jpg");
        gc.drawImage(pic2, 0, 0);
        gc.fillText("Понивиль", 300, 100);
        gc.strokeText("Понивиль", 300, 100);
        Image pic1 = new Image("pony4.png");
        Image pic4 = new Image("pony5.png");
        Image pic3 = new Image("pony6.png");

        gc.drawImage(pic1, 30, 370);
        gc.drawImage(pic4, 400, 250);
        gc.drawImage(pic3, 550, 550);
        gc.setFill(Color.GREY);
        gc.setLineWidth(2);
        root.getStylesheets().add("css/buttonStyles.css");
        Font in = Font.font("Times New Roman", FontWeight.BOLD, 18);
        gc.setFont(in);
        gc.fillText("©ПЯТОВА НАТАЛЬЯ ФМФИ-б18ПИо", 550, 870);
        theStage.show();
    }
}
