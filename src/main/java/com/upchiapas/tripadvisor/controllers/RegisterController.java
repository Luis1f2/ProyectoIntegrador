package com.upchiapas.tripadvisor.controllers;

import com.upchiapas.tripadvisor.HelloApplication;
import com.upchiapas.tripadvisor.models.User;
import com.upchiapas.tripadvisor.models.ValidateUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;


import java.util.ArrayList;

public class RegisterController {


    private TextField TXTname;

    private TextField TxTUsuarioName;

    private TextField txtCorreo;

    private PasswordField TXTPassword;

    private PasswordField TxtPasswordconfir;

    @FXML
    void btnCrearnewOnmouseclicked(MouseEvent event) {
        ValidateUser user = new ValidateUser();

        if(TXTPassword==TxtPasswordconfir){
            HelloApplication.setFXML("login-view","iniciar seccion");


        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Seccion Fallidad");
            alert.setContentText("La Contraseña no concide");
        }


    }


}



