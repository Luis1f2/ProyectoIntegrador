package com.upchiapas.tripadvisor.controllers;

import com.upchiapas.tripadvisor.HelloApplication;
import com.upchiapas.tripadvisor.models.Registrar;
import com.upchiapas.tripadvisor.models.User;
import com.upchiapas.tripadvisor.models.ValidadRegistro;
import com.upchiapas.tripadvisor.models.ValidateUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import java.util.ArrayList;

public class RegisterController  {


    @FXML
    private Button BTNCrear;
    @FXML
    private TextField TXTCorreo;

    @FXML
    private TextField TXTName;

    @FXML
    private TextField TXTNombreUsuario;

    @FXML
    private PasswordField TXTPassword;

    @FXML
    private PasswordField TXTPasswordConfir;

    @FXML
    void BTNCrearOnmouseclicked(MouseEvent event) {



        if(TXTPassword.getText().equals(TXTPasswordConfir.getText())){
            ValidateUser vec = new ValidateUser();
            User user;
            user = new User(TXTName.getText(),TXTNombreUsuario.getText(),TXTPassword.getText());
            vec.users.add(user);


            HelloApplication.setFXML("login-view","iniciar seccion");


        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Seccion Fallidad");
            alert.setContentText("La Contraseña no concide");
        }


    }


}



