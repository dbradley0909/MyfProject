package projectfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class LoginForm extends Application {
    static Stage window = new Stage();
    Scene scene1,scene2;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        primaryStage.setTitle("CalorieCounter App");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(50, 50, 50, 50));
        
        Text scenetitle = new Text("Welcome to \n \t Calorie Counter");
        scenetitle.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("UserName:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        userTextField.setPromptText("Username");
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        pwBox.setPromptText("Password");
        grid.add(pwBox, 1, 2);

        Button newbtn = new Button("Enter");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(newbtn);
        grid.add(hbBtn, 1, 4);
        
        

        Button nnewbtn = new Button("Sign up");
        HBox nnewhbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(nnewbtn);
        grid.add(nnewhbBtn, 1, 5);
       
        Button newBtnTwo = new Button("Exit");
        HBox newhbBtnTwo = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(newBtnTwo);
        grid.add(newhbBtnTwo, 1, 6);


        
        primaryStage.show();

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

         newBtnTwo.setOnAction(e -> CloseAlert.display("Title of window", "Are you sure you want to leave"));
     
        Scene scene1 = new Scene(grid, 400, 375);
        primaryStage.setScene(scene1);
        primaryStage.show();  
        primaryStage.setAlwaysOnTop(true);
        // bottom code prevents argument from expanding 
        primaryStage.setResizable(false);
       
    
        newbtn.setOnAction(e -> {
            Scene scene2 = new Scene(grid, 500, 475);
            primaryStage.setScene(scene2);
      });
           
            
    }
    public static void main(String[] args) {
        launch(args);
    }
}
