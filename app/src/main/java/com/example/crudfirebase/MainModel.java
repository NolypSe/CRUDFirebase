package com.example.crudfirebase;

public class MainModel {

    String Nombre, Apellido, Email, ImgUrl;

    public MainModel() {
    }

    public MainModel(String Nombre, String Apellido, String Email, String ImgUrl) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.ImgUrl = ImgUrl;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        Email = Email;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        ImgUrl = ImgUrl;
    }
}
