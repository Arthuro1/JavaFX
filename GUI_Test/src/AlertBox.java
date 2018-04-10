import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

	public static void display(String title, String message) {
		
		Stage window = new Stage();
		//block user interaction until the window is closed
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText(message);
		
		Button close = new Button("Close");
		close.setOnAction(e->window.close());
		
		VBox layout = new VBox();	
		layout.getChildren().addAll(label, close);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.showAndWait();
		
	}
}
