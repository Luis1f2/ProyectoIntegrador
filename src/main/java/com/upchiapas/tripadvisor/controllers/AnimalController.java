package com.upchiapas.tripadvisor.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.upchiapas.tripadvisor.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
public class AnimalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Button BtNBorrego;

    @FXML
    private Button BtNChiken;

    @FXML
    private Button BtNGanado;

    @FXML
    private Button BtNGuajolote;

    @FXML
    private Button BtNPorqui;

    @FXML
    private Button BtNAtras;
    @FXML
    void BtNBorregoOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Vacuna01", "Vacuna-TripAdvisor");
    }
    @FXML
    void BtNChikenOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Vacuna03", "Vacuna-TripAdvisor");
    }

    @FXML
    void BtNGanadoOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Vacunas02", "Vacuna-TripAdvisor");
    }

    @FXML
    void BtNGuajoloteOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Vacuna03", "Menu-TripAdvisor");
    }

    @FXML
    void BtNPorquiOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Vacuna04", "Vacuna-TripAdvisor");
    }
    @FXML
    void BtNAtrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Menu", "Menu-TripAdvisor");
    }
    @FXML
    void initialize() {
    }

}
