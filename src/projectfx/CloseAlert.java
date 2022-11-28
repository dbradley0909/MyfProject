package projectfx;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class CloseAlert{
    
    public static void display(String Title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Are you sure?");
        Label label = new Label();
        label.setText("Exit Program?");
        Button closeButton = new Button("close Window");
        closeButton.setOnAction(e-> window.close());
        VBox layout = new VBox(50);
        layout.getChildren().addAll(label,closeButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();  

    }
}