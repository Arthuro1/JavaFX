import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {

	static boolean answer; 
public static boolean display(String title, String message) {
		
		Stage window = new Stage();
		//block user interaction until the window is closed
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText(message);
		
		Button buttonTrue = new Button("true");
		Button buttonFalse = new Button("false");
		
		buttonTrue.setOnAction(e->{
			answer = true;
			window.close();
		});
		buttonFalse.setOnAction(e->{
			answer = false;
			window.close();
		});
		VBox layout = new VBox();	
		HBox hBox = new HBox();
		hBox.getChildren().addAll(buttonTrue, buttonFalse);
		layout.getChildren().addAll(label, hBox);
		layout.setAlignment(Pos.CENTER);
		hBox.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout, 300,250);
		window.setScene(scene);
		window.showAndWait();
		return answer;
		
	}
}
