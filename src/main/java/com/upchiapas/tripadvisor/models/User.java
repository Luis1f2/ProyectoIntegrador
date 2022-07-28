package com.upchiapas.tripadvisor.models;

public class User extends Registrar {

            private String nombre;
            private String username;
            private String password;

    public User(String nombre, String username, String password) {
        super(nombre,username,password);
        this.nombre = nombre;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


