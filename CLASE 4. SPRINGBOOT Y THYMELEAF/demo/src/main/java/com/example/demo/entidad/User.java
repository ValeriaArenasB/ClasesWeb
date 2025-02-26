package com.example.demo.entidad;

//POJO (Plain Old Java Object) = clase que solo tiene atributos y metodos getter y setter, no metodos avanzados

public class User {

    private String name;
    private String userName;
    private String correo;
    private int edad;

    public User(String name, String userName, String correo, int edad) {
        this.name = name;
        this.userName = userName;
        this.correo = correo;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
