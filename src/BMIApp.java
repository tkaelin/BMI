import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BMIApp extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	
	private void FillLayout(Pane pane)
	{
		for (int ix = 0; ix < 7; ix++) {
			String stringValueIx = String.valueOf(ix);
			Button b = new Button(stringValueIx);
			b.setMinSize(60, 60);
			b.setOnAction(e -> { 
				Alert a = new Alert(AlertType.INFORMATION);
				a.setTitle("Button gedrückt");
				a.setHeaderText("Ein Button wurde gerade gedrückt");
				a.setContentText(stringValueIx + " wurde gedrückt");
				a.showAndWait();
			}
			);
			pane.getChildren().add(b);
		}
	}
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new FlowPane();
		FillLayout(pane);
		Scene scene = new Scene(pane);
		scene.getStylesheets().add("BMI2Style.css");
		primaryStage.setScene(scene);
		primaryStage.setTitle("BMI-Berechnung");
		primaryStage.setMaxHeight(200); 
		primaryStage.show();
	
	}
	

}
