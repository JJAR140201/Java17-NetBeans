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
import jakarta.persistence.UniqueConstraint;

/**
 *
 * @author juana
 */
@Entity
@Table(name = "Cliente", uniqueConstraints = {
        @UniqueConstraint(columnNames = "numIdentif")
})
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    private String nombre;
    private String apellido;
    private String numIdentif;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumIdentif() {
        return numIdentif;
    }

    public void setNumIdentif(String numIdentif) {
        this.numIdentif = numIdentif;
    }

    public Cliente(int idCliente, String nombre, String apellido, String numIdentif) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numIdentif = numIdentif;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + 
                ", nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", numIdentif=" + numIdentif + '}';
    }
}
