package projectfx;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
        VBox calorieStartPane = new VBox(10);
        calorieStartPane.setAlignment(Pos.CENTER);
        HBox hBoxStartButtons = new HBox(10);
        hBoxStartButtons.setAlignment(Pos.CENTER);
        Button btnExit = new Button("Exit");
        Button calorieStartCalorie = new Button("Start");
        hBoxStartButtons.getChildren().addAll(calorieStartCalorie, btnExit);
        HBox hBoxCalorie = new HBox(10);
        hBoxCalorie.setAlignment(Pos.CENTER);
        calorieStartPane.getChildren().addAll(new Label("CALORIE COUNTER"), new Label(""), hBoxCalorie, hBoxStartButtons);

        Scene startCalorieScene = new Scene(calorieStartPane, 300, 150);

        btnExit.setOnAction(e -> {
            primaryStage.close();
        });

        calorieStartCalorie.setOnAction(e -> {
            caloriePane calorie = new caloriePane();
            //calorieScene = new Scene(calorie, 450, 300);
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

        primaryStage.setTitle("calorie"); // Set the stage title
        primaryStage.setScene(startCalorieScene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public class caloriePane extends BorderPane {

        public caloriePane() {
            super();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
