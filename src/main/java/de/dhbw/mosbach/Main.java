package de.dhbw.mosbach;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Yajisan-Kazusan");
        primaryStage.getIcons().add(new Image(getClass().getClassLoader().getResource("images/icon.png").toExternalForm()));

        Parent menu = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/MenuScene.fxml"));
        Scene menuScene = new Scene(menu);
        menuScene.getStylesheets().add(getClass().getClassLoader().getResource("css/style.css").toExternalForm());
        primaryStage.setScene(menuScene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
