package com.upchiapas.tripadvisor.models;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ValidateUser {

    private ArrayList<User> users = new ArrayList<>();

    public ValidateUser(){
        users.add(new User("Isaac Estrada", "isaacestrada", "221257"));
        users.add(new User("Luis Fernando", "Fernando", "asdfg"));
        users.add(new User("Layka Pereyra", "Laykaps", "amoamimama"));
        users.add(new User("Esmeralda Sanchez", "Esmeraldaxd", "monsexdxd"));

    }
    public boolean autenticarUser(String username, String Password ){
        boolean status = false;
        User user = findUser(username);
        if ( user != null && user.getPassword().equals(Password)){
            status = true;
        }
       return status;
    }
    private User findUser (String username){
        User user = null;
        boolean status = false;
        int index = 0;
        while (!status && index<users.size()){
            if (users.get(index).getUsername().equals(username)){
                user = users.get(index);
                status = true;
            }
            index++;
        }
        return user;
    }
}
