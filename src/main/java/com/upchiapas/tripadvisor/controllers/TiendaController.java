package com.upchiapas.tripadvisor.controllers;
import java.net.URL;
import java.util.ResourceBundle;

import com.upchiapas.tripadvisor.HelloApplication;
import javafx.fxml.FXML;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
public class TiendaController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Button BtNAtras;

    @FXML
    void BtNAtrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Menu", "Menu-TripAdvisor");
    }

    @FXML
    private Button BtNAzadon;

    @FXML
    private Button BtNBerengena;

    @FXML
    private Button BtNMaiz;

    @FXML
    private Button BtNPala;

    @FXML
    private Button BtNPalaras;

    @FXML
    private Button BtNPepiinillo;

    @FXML
    private Button BtNTrinche;

    @FXML
    private Button BtNSandia;

    @FXML
    void BtNSandiaOnMouseClicked(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Desea Compras - Compra");
        alert.setContentText("Esta seguro de compralo");
        alert.showAndWait();
    }

    @FXML
    void BtNAzadonOnMouseCliked(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Desea Compras - Compra");
        alert.setContentText("Esta seguro de compralo");
        alert.showAndWait();

    }

    @FXML
    void BtNBerengenaOnMouseClicked(MouseEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Desea Compras - Compra");
        alert.setContentText("Esta seguro de compralo");
        alert.showAndWait();
    }

    @FXML
    void BtNMaizOnMouseClicked(MouseEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Desea Compras - Compra");
        alert.setContentText("Esta seguro de compralo");
        alert.showAndWait();
    }

    @FXML
    void BtNPalaOnMouseClicked(MouseEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Desea Compras - Compra");
        alert.setContentText("Esta seguro de compralo");
        alert.showAndWait();
    }

    @FXML
    void BtNPalarasOnMouseClicked(MouseEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Desea Compras - Compra");
        alert.setContentText("Esta seguro de compralo");
        alert.showAndWait();
    }

    @FXML
    void BtNPepinilloOnMouseClicked(MouseEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Desea Compras - Compra");
        alert.setContentText("Esta seguro de compralo");
        alert.showAndWait();
    }

    @FXML
    void BtNTrincheOnMouseClicked(MouseEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Desea Compras - Compra");
        alert.setContentText("Esta seguro de compralo");
        alert.showAndWait();

    }
    @FXML
    void initialize() {

    }

}
