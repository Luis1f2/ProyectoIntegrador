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
    void BtNBorregoOnMouseCliked(MouseEvent event) {

    }

    @FXML
    void BtNChikenOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void BtNGanadoOnMouseCliced(MouseEvent event) {

    }

    @FXML
    void BtNGuajoloteOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void BtNPorquiOnMouseClicked(MouseEvent event) {

    }
    @FXML
    void BtNAtrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Menu", "Menu-TripAdvisor");
    }
    @FXML
    void initialize() {
    }

}
