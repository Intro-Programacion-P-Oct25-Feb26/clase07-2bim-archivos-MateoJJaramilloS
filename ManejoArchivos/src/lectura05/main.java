/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;


/**
 *
 * @author User
 */
public class main {
    public static void main(String args[]) {
        Estadistica est = new Estadistica();
        
        // Llamada a la función
        double resultado = est.obtenerPromedioEmpleados("data/sucursales.txt");
        System.out.println("El promedio de empleados es: " + resultado); } }

