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
import java.sql.Date;

/**
 *
 * @author juana
 */
@Entity
@Table(name = "Cita")
public class Cita {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCita;
    private Date fecha;
    private double valorCancelado;
    private int idProfesional;
    private int idServicio;
    private int idCliente;

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValorCancelado() {
        return valorCancelado;
    }

    public void setValorCancelado(double valorCancelado) {
        this.valorCancelado = valorCancelado;
    }

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cita(int idCita, Date fecha, double valorCancelado, int idProfesional, int idServicio, int idCliente) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.valorCancelado = valorCancelado;
        this.idProfesional = idProfesional;
        this.idServicio = idServicio;
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cita{" + "idCita=" + idCita +
                ", fecha=" + fecha + 
                ", valorCancelado=" + valorCancelado 
                + ", idProfesional=" + idProfesional 
                + ", idServicio=" + idServicio + 
                ", idCliente=" + idCliente + '}';
    }
    
    
}
