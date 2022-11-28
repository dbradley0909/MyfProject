package projectfx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Look extends Application {
    private Scene calorieScene;
	
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calorie Counter App"); // Set the stage title
        VBox calorieStartPane = new VBox(5);
        calorieStartPane.setAlignment(Pos.CENTER);
        HBox hBoxStartButtons = new HBox(5);
        hBoxStartButtons.setAlignment(Pos.CENTER);
        Button btnExit = new Button("Exit");
        Button calorieStartCalorie = new Button("Start");
        Button nnewbtn = new Button("Sign up");
        Label label1 = new Label("UserName:");
        TextField textField1 = new TextField();
        textField1.setPromptText("Username");
        Label pw = new Label("Password:");
        PasswordField pwBox = new PasswordField();
        pwBox.setPromptText("Password");
        calorieStartPane.setPadding(new Insets(1, 5 , 5, 1));
       
        hBoxStartButtons.getChildren().addAll(calorieStartCalorie,nnewbtn, btnExit);
        HBox hBoxCalorie = new HBox(5);
        
        hBoxCalorie.setAlignment(Pos.CENTER);
        calorieStartPane.getChildren().addAll(new Label("Welcome to Calorie Counter"),label1,textField1,pw,pwBox,hBoxCalorie,hBoxStartButtons);

        Scene startCalorieScene = new Scene(calorieStartPane, 500, 250);

        btnExit.setOnAction(
          e -> CloseAlert.display("Title of window", "Are you sure you want to leave"));
        

        calorieStartCalorie.setOnAction(e -> {
            caloriePane calorie = new caloriePane();
            calorieScene = new Scene(calorie, 450, 300);
///////////////////////////////////////////////////////////////////////////////////			
			
			HBox h = new HBox();
			final RadioButton m = new RadioButton("male");
			final RadioButton f = new RadioButton("female");
			final Label l1 = new Label("Weight in kg");
			final TextField t1 = new TextField("");
			final Label l2 = new Label("Size in cm");
			final TextField t2= new TextField("");
			final Label l3 = new Label("Age");
			final TextField t3 = new TextField("");
			final Label result = new Label("");
			final ComboBox combo = new ComboBox<String>();
			combo.getItems().setAll("low","little","medium","high");
			Button b = new Button("Calculate");
			
			h.getChildren().addAll(m,f,l1,t1,l2,t2,l3,t3,combo,b,result);
			
			calorieScene = new Scene(h);
			//st.setScene(s);
			//st.show();
			
			b.setOnAction(new EventHandler<ActionEvent>(){

				public void handle(ActionEvent arg0) {
					
					double factor = 0;
					
					switch(combo.getSelectionModel().getSelectedIndex()){
						case 0:
							factor = 1.2;
						case 1:
							factor = 1.375;
						case 2:
							factor =  1.55;
						case 3:
							factor = 1.725;
					}
					System.out.println(""+factor);
					double weight = Double.parseDouble(t1.getText())*10;
					double height = Double.parseDouble(t2.getText())*6.25;
					double age = Double.parseDouble(t3.getText());
					
					if(m.isSelected()){
						double caloriesMale = (weight+height-5*age+5)*factor;
						result.setText(""+caloriesMale);
								
					} else{
						double caloriesFemale = (weight+height-5*age-161)*factor;
						result.setText(""+caloriesFemale);
					}
					
				}
				
			});
            primaryStage.setScene(calorieScene);
        });

        primaryStage.setScene(startCalorieScene); 
        primaryStage.show(); // Display the stage
        primaryStage.setAlwaysOnTop(true);
        // bottom code prevents argument from expanding 
        primaryStage.setResizable(false);
    }

    public class caloriePane extends BorderPane {

        public caloriePane() {
            super();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }


	public static void display() {
	}
}
