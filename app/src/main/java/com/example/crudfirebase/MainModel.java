package com.example.crudfirebase;

public class MainModel {

    String Nombre, Apellido, Email, ImgUrl;

    public MainModel() {
    }

    public MainModel(String nombre, String apellido, String email, String imgUrl) {
        Nombre = nombre;
        Apellido = apellido;
        this.Email = email;
        this.ImgUrl = imgUrl;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }
}
