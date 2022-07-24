package com.upchiapas.tripadvisor.controllers;
import java.net.URL;
import java.util.ResourceBundle;

import com.upchiapas.tripadvisor.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;

public class MenuController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Button BtNAnimales;

    @FXML
    private Button BtNSemillas;

    @FXML
    private Button BtNTienda;

    @FXML
    void BtNAnimalesOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Veterinaria","Cuidado Animal");
    }

    @FXML
    void BtNSemillasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Consejos de cultivo","Consejos y Recomendaciones");
    }

    @FXML
    void BtNTiendaOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Tienda","Tienda");
    }

    @FXML

    void initialize() {

    }


}
