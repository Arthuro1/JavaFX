import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Button button;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("My GUI");
		button = new Button("Click Me!!!");
		
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
		
		// with lambda expression
		button.setOnAction(e-> {
			System.out.println("Super");
			System.out.println("aaa");
		}); 
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	

}
