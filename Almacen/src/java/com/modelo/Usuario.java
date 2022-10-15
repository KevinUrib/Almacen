
package com.modelo;

/**
 *
 * @author Kevin Uribe
 */
public class Usuario {
    private int idUser;
    private String username;
    private String contra;
    private String nivel;

    public Usuario() {
    }

    public Usuario(int idUser, String username, String contra, String nivel) {
        this.idUser = idUser;
        this.username = username;
        this.contra = contra;
        this.nivel = nivel;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    
    
}
