import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	Button button1, button2, button3;
	Stage window;
	Scene scene1, scene2;
	VBox layout2 = new VBox();
	VBox layout1 = new VBox();

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window= primaryStage;
		Label label1 = new Label("First Scene!!!");
		window.setTitle("My first window");
		button1 = new Button("Go to scene 2");
		button3 = new Button("Go to scene 1");
		button2 = new Button("Confirm the weather");
		button2.setOnAction(e->{
			boolean response = ConfirmBox.display("Confirm Box ", "Today is sunny.");
			if(response == true) {
				Label label2 = new Label("Today is sunny");
				layout2.getChildren().add(label2);
			}else {
				Label label2 = new Label("Today is not sunny");
				layout2.getChildren().add(label2);
			}
		});
		button1.setOnAction(e->window.setScene(scene2));
		button3.setOnAction(e->window.setScene(scene1));
		/**for handling a button click the method is provided in "this"( the handle method)
		
		button.setOnAction(this);
		
		@Override
		public void handle(ActionEvent event) {
			if(event.getSource()==button) {
				System.out.println("Super");
			}
		}**/
		
		/**or with the compact form
		 
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				if(event.getSource()==button) {
					System.out.println("Super");
				}
			}
		});**/ 
		
		layout1.getChildren().addAll(label1, button1);
		layout1.setAlignment(Pos.CENTER);
		layout2.getChildren().addAll(button2, button3);
		layout2.setAlignment(Pos.CENTER);
		scene1 = new Scene(layout1, 300, 250);
		scene2 = new Scene(layout2, 300, 250);
		window.setScene(scene1);
		window.show();
	}

	

}
