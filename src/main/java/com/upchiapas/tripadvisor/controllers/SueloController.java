package com.upchiapas.tripadvisor.controllers;
import com.upchiapas.tripadvisor.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
public class SueloController {

    @FXML
    private Button BtNAtras;

    @FXML
    void BtNAtrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Consejos de Cultivo", "Consejo-TripAdvisor");
    }
}
