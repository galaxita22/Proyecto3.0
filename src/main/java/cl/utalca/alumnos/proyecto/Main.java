package cl.utalca.alumnos.proyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


import java.io.IOException;

public class Main extends Application {
    static Stage stageTemporal;

    @Override
    public void start(Stage stage) throws IOException {
        stageTemporal = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("hello-view2.fxml"));

        Scene scene = new Scene(fxmlLoader2.load(), 848, 440);
        stage.setScene(scene);


        stage.show();

//        Scene scene = new Scene(fxmlLoader.load(), 848, 440);
//
//        stageTemporal.setTitle("Calculadora");
//        stageTemporal.setScene(scene);
//
//        //Image icon = new Image(String.valueOf(Main.class.getResource("logo.png")));
//        //stage.getIcons().add(icon);
//
//        stageTemporal.show();
    }

    public static void cambiarEscena(String escena) throws IOException {
        FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("hello-view2.fxml"));
        stageTemporal.setScene(new Scene(fxmlLoader2.load(), 848, 440));
        stageTemporal.show();
    }
    public static void main(String[] args) {
        launch();
    }

}