package com.upchiapas.tripadvisor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    private static Scene scene;
    private  static Stage login;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        scene = new Scene(loadFXML("Login-view"));
        stage.setTitle("Login - Tripadvisor");
        stage.setScene(scene);
        stage.centerOnScreen();  //centra la pantalla en tiempo de ejecuccion
        stage.setResizable(false);  //Impide que el ususario pueda modificar el tamaño de la pantalla
        stage.show();
    }
    public static Parent loadFXML(String nameView) {
           FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource( nameView + ".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setFXML(String nameView, String title){
        scene.setRoot(loadFXML(nameView)); //sustiruir en el objeto scene el archivo de vista
        stage.sizeToScene(); //renderisar el tamaño el stage con las dimenciones de la nueva vista
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setTitle(title);

    }
public void  Start(Stage login) throws IOException{
        this.login = login;
        scene = new Scene(loadFXML("Register-view"));
        login.setTitle("Register- Tripadvisor");
        login.setScene(scene);
        login.centerOnScreen();
        login.setResizable(false);
        stage.show();

}

    public static void main(String[] args) {
        launch();
    }
}