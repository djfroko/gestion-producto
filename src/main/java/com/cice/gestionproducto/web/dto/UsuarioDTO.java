package com.cice.gestionproducto.web.dto;

public class UsuarioDTO {

    private Long id;
    private String nombre;
    private String user;
    private String email;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Long id, String nombre, String user, String email) {

        this.id = id;
        this.nombre = nombre;
        this.user = user;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
