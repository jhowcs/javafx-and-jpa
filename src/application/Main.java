package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane root;		
		
		try {
			root = FXMLLoader.load(getClass().getResource("CreateUser.fxml"));
			Scene scene = new Scene(root, 766, 600);
			primaryStage.setScene(scene);
			
			primaryStage.setTitle("JavaFX and JPA");			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
