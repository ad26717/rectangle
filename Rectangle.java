import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

public class Rectangle extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		
		TextInputDialog textinputdialog = new TextInputDialog();
		textinputdialog.setHeaderText("Now enter the with and the height of the rectangle delimited by space");
		Optional<String> input = textinputdialog.showAndWait();
		String [] side = input.get().split(" ");

		double withoftherectangle = Double.parseDouble(side[0]);
		double heightoftherectangle = Double.parseDouble(side[1]);
		
		double areaoftherectangle, perimeteroftherectangle;
		
		areaoftherectangle = withoftherectangle*heightoftherectangle;
		perimeteroftherectangle = 2* (heightoftherectangle + withoftherectangle);

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("The perimeter of the rectangle is " + perimeteroftherectangle + "\nThe area of the rectangle is " + areaoftherectangle + ".");
		alert.showAndWait();

	}

}
