package com.upchiapas.tripadvisor.models;

import com.upchiapas.tripadvisor.controllers.RegisterController;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Registrar extends RegisterController {
private String Nombre;
private String Passwor;
private String NombreUsuario;

    public Registrar(String nombre, String passwor, String nombreUsuario) {
        Nombre = nombre;
        Passwor = passwor;
        NombreUsuario = nombreUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPasswor() {
        return Passwor;
    }

    public void setPasswor(String passwor) {
        Passwor = passwor;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }

    public Registrar(TextField txTUsuarioName, PasswordField TXTPassword, TextField TXTname) {
        RegisterController registerController = new RegisterController();
        ArrayList<User> users= new ArrayList<>();

        users.add(new User(NombreUsuario,Passwor,Nombre));


    }



    public void Algo() {
        if(getNombreUsuario()==getNombre()){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("Vienbenido - Compra");
            alert.setContentText("Quieres Continuar");
            alert.showAndWait();

        }else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setTitle("Error - Compra");
            alert.setContentText("Contraseña O Usiario Incorrecto");
            alert.showAndWait();

        }
    }



    @Override
    public String toString() {
        return "Registrar{" +
                "Nombre='" + Nombre + '\'' +
                ", Passwor='" + Passwor + '\'' +
                ", NombreUsuario='" + NombreUsuario + '\'' +
                '}';
    }
}
