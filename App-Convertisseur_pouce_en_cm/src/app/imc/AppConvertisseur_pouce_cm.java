package app.imc;

import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

/**
 *
 * @author p
 */
public class AppConvertisseur_pouce_cm extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Fenetre.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Convertisseur pouce en cm ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        launch(args);
    }
}
