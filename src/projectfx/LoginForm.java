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


//import javafx.scene.layout.Background;

public class LoginForm extends Application {
    
    Stage window = new Stage();
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
       ////
        newbtn.setOnAction(e -> {
    
        primaryStage.setTitle("CalorieCounter App");
        GridPane gridl = new GridPane();
        gridl.setAlignment(Pos.CENTER);
        gridl.setHgap(10);
        gridl.setVgap(10);
        gridl.setPadding(new Insets(50, 50, 50, 50));
        
        Text scenetit= new Text("Welcome to \n \t Calorie Counter");
        scenetitle.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
        gridl.add(scenetitle, 0, 0, 2, 1);

        Label userNam = new Label("UserName:");
        gridl.add(userNam, 0, 1);

        TextField userTextFiel = new TextField();
        userTextFiel.setPromptText("Username");
        gridl.add(userTextField, 1, 1);

        Label p = new Label("Password:");
        gridl.add(p, 0, 2);

        PasswordField pwBo = new PasswordField();
        pwBo.setPromptText("Password");
        gridl.add(pwBox, 1, 2);

       
        });

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
   
     
        Scene scene = new Scene(grid, 400, 375);
        primaryStage.setScene(scene);
        primaryStage.show();  
        primaryStage.setAlwaysOnTop(true);
        // bottom code prevents argument from expanding
        primaryStage.setResizable(false);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
