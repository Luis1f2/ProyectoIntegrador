package com.upchiapas.tripadvisor.controllers;

import com.upchiapas.tripadvisor.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RootController {

    @FXML
    private Button btnSalir;


    @FXML
    private Button btnSearch;

    @FXML
    private TextField txtSearch;

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {


    }

    @FXML
    void btnSearchOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("user-view", "Add user TripAdvisor");

    }

}