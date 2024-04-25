/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author juana
 */
@Entity
@Table(name = "Registro")
public class Registro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistro;
    
    private String correoElectronico;
    private String contrasena;
    
    @OneToOne
    private Cliente cliente;

    public Long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Long idRegistro) {
        this.idRegistro = idRegistro;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Registro(Long idRegistro, String correoElectronico, String contrasena, Cliente cliente) {
        this.idRegistro = idRegistro;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Registro{" + "idRegistro=" + idRegistro + ", correoElectronico=" + correoElectronico + ", contrasena=" + contrasena + ", cliente=" + cliente + '}';
    }
}
