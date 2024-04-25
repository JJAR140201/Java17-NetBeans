/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal;

import View.Inicio;
import com.mycompany.proyectofinal.Connector.Connector;
import java.sql.Connection;
import javax.swing.JFrame;

/**
 *
 * @author juana
 */
public class ProyectoFinal {

    public static void main(String[] args) {
        // Llama al método getConnection() de la clase Connector para obtener una conexión a la base de datos
        Connection connection = Connector.getConnection();
        
        // Verifica si la conexión es nula
        if (connection != null) {
            
            // Crear una instancia de la interfaz InicioSesion
            Inicio inicio = new Inicio();
            
            // Mostrar la interfaz InicioSesion
            inicio.setVisible(true);
            
            System.out.println("¡Conexión exitosa!");
            // Aquí puedes agregar más código para interactuar con la base de datos
        } else {
            System.out.println("Error: No se pudo establecer conexión con la base de datos.");
        }
    }
}
