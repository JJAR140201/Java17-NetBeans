/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author juana
 */
@Entity
@Table(name = "InicioSesion")
public class InicioSesion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInicioSesion;
    
    private String correoElectronico;
    private String contrasena;

    public Long getIdInicioSesion() {
        return idInicioSesion;
    }

    public void setIdInicioSesion(Long idInicioSesion) {
        this.idInicioSesion = idInicioSesion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "InicioSesion{" + "idInicioSesion=" + idInicioSesion + ", correoElectronico=" + correoElectronico + ", contrasena=" + contrasena + '}';
    }

    public InicioSesion(Long idInicioSesion, String correoElectronico, String contrasena) {
        this.idInicioSesion = idInicioSesion;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }
    
    
}
