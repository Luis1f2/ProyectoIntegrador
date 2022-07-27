package com.upchiapas.tripadvisor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    private static Scene scene;
    private  static Stage login;
    private Stage cargar;
    private Stage prol;
    private Stage frel;
    private Stage troll,maiz,sandia,sorgo,calabaza,tomate,suelo;

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
public void Esene(Stage cargar) throws IOException{
    this.cargar = cargar;
    scene = new Scene(loadFXML("Menu"));
    cargar.setTitle("Menu- Trpadvisor");
    cargar.setScene(scene);
    cargar.centerOnScreen();
    cargar.setResizable(false);
    stage.show();

}

public void Inicio(Stage prol) throws IOException{
this.prol =  prol;
scene = new Scene(loadFXML("Consejos de cultivo"));
prol.setTitle("consejo-Tradvisor");
prol.setScene(scene);
prol.centerOnScreen();
prol.setResizable(false);
stage.show();


}
public void STARt(Stage frel) throws IOException{
    this.frel =  frel;
    scene = new Scene(loadFXML("Tienda"));
    prol.setTitle("Tienda-Tradvisor");
    prol.setScene(scene);
    prol.centerOnScreen();
    prol.setResizable(false);
    stage.show();

}
public void prolll(Stage prol)throws IOException{
        this.prol = prol;
    scene = new Scene(loadFXML("Veterinaria"));
    prol.setTitle("Veterinaria-Tradvisor");
    prol.setScene(scene);
    prol.centerOnScreen();
    prol.setResizable(false);
    stage.show();

}

public void Maiz1(Stage maiz) throws IOException {
        this.maiz = maiz;
    scene = new Scene(loadFXML("Maiz"));
    maiz.setTitle("Maiz-Tradvisor");
    maiz.setScene(scene);
    maiz.centerOnScreen();
    maiz.setResizable(false);
    stage.show();
}
public void Calabaza1(Stage calabaza) throws IOException{
        this.calabaza = calabaza;
    scene = new Scene(loadFXML("Calabazas"));
    calabaza.setTitle("Calabaza-Tradvisor");
    calabaza.setScene(scene);
    calabaza.centerOnScreen();
    calabaza.setResizable(false);
    stage.show();

}
public void Sandia1(Stage sandia)throws IOException{
        this.sandia = sandia;
    scene = new Scene(loadFXML("Sandia"));
    sandia.setTitle("Sandia-Tradvisor");
    sandia.setScene(scene);
    sandia.centerOnScreen();
    sandia.setResizable(false);
    stage.show();


}
public void Sorgo1(Stage sorgo) throws IOException{
        this.sorgo = sorgo;
    scene = new Scene(loadFXML("Sorgo"));
    sorgo.setTitle("Sorgo-Tradvisor");
    sorgo.setScene(scene);
    sorgo.centerOnScreen();
    sorgo.setResizable(false);
    stage.show();


}
public void Suelo1(Stage suelo) throws IOException{
        this.suelo = suelo;
    scene = new Scene(loadFXML("Suelo"));
    suelo.setTitle("Suelo-Tradvisor");
    suelo.setScene(scene);
    suelo.centerOnScreen();
    suelo.setResizable(false);
    stage.show();

}
public void Tomate1(Stage tomate)throws IOException{
        this.tomate = tomate;
    scene = new Scene(loadFXML("Tomates"));
    tomate.setTitle("Tomates-Tradvisor");
    tomate.setScene(scene);
    tomate.centerOnScreen();
    tomate.setResizable(false);
    stage.show();

}
    public static void main(String[] args) {
        launch();
    }
}