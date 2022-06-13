package cl.utalca.alumnos.proyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
	static Stage stageTemporal;

	@Override
	public void start(Stage stage) throws IOException {
		//System.out.println(Integer.toBinaryString(1000)); Esto era para ver el numero en binario
		stageTemporal = stage;

		Main.cambiarEscena("Standard");

		stageTemporal.show();
	}

	public static void cambiarEscena(String escena) throws IOException {
		FXMLLoader fxmlLoader = null;

		if (escena.equals("Standard"))
			fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
		else if (escena.equals("Scientific"))
			fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view2.fxml"));

		if (fxmlLoader == null) {
			System.out.println("Error al cargar la escena");
			return;
		}

		Scene scene = new Scene(fxmlLoader.load(), 848, 440);
		stageTemporal.setScene(scene);
		stageTemporal.show();
	}

	public static void main(String[] args) {
		launch();
	}
}