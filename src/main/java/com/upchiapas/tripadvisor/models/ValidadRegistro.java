package com.upchiapas.tripadvisor.models;

import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ValidadRegistro extends Registrar {


    public ValidadRegistro(TextField txTUsuarioName, PasswordField TXTPassword, TextField TXTname) {
        super(txTUsuarioName, TXTPassword, TXTname);
    }

    public void Validalo(String nombre) {
        ArrayList<Registrar> registrars = new ArrayList<>();


        Registrar registre = null;
        boolean status = true;
        String registrar = (getNombreUsuario());
        if (registrar != null && getNombreUsuario().equals(nombre)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("Desa continuar - Registro");
            alert.setContentText("Sguro que el nombre estacorrecto");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setTitle("Verifique - Compra");
            alert.setContentText("Su nombre o contraseña esta vacia");
            alert.showAndWait();

        }

    }
}


