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
@Table(name = "Profesional", uniqueConstraints = {
        @UniqueConstraint(columnNames = "numIdentif")
})
public class Profesional {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesional;
    private String nombre;
    private String apellido;
    private String numIdentif;

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
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

    public Profesional(int idProfesional, String nombre, String apellido, String numIdentif) {
        this.idProfesional = idProfesional;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numIdentif = numIdentif;
    }

    @Override
    public String toString() {
        return "Profesional{" + "idProfesional=" + idProfesional + 
                ", nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", numIdentif=" + numIdentif + '}';
    }
}
