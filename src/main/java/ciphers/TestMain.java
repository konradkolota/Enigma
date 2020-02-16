package ciphers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/Test.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 400, 600);
        stage.setTitle("Enigma");
        stage.setScene(scene);
        stage.show();
    }
}
