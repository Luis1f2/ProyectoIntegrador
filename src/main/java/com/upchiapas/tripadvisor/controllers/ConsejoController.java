package com.upchiapas.tripadvisor.controllers;
import java.net.URL;
import java.util.ResourceBundle;

import com.upchiapas.tripadvisor.HelloApplication;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ConsejoController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtNAtras;

    @FXML
    private Button BtNCalabaza;

    @FXML
    private Button BtNMaiz;

    @FXML
    private Button BtNSandia;

    @FXML
    private Button BtNSorgo;

    @FXML
    private Button BtNSuelo;

    @FXML
    private Button BtNTomate;



    @FXML
    void BtNCalabazaOnMouseCliked(MouseEvent event) {
        HelloApplication.setFXML("Calabazas", "Calabaza-TripAdvisor");

    }

    @FXML
    void BtNMaizOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Maiz", "Consejo-TripAdvisor");
    }

    @FXML
    void BtNSandiaOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Sandia", "Sandia-TripAdvisor");
    }

    @FXML
    void BtNSorgoOnMouseCliked(MouseEvent event) {
        HelloApplication.setFXML("Sorgo", "Sorgo-TripAdvisor");
    }

    @FXML
    void BtNSueloOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Suelo", "Suelo-TripAdvisor");
    }

    @FXML
    void BtNTomateOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Tomates", "Consejo-TripAdvisor");
    }
    @FXML
    void initialize() {

    }

    public void BtNAtrasOnMuoseCliked(MouseEvent mouseEvent) {
        HelloApplication.setFXML("Menu", "Menu-TripAdvisor");
    }
}
