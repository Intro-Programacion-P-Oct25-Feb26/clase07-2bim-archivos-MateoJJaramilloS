/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese su nombre:");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese la placa del vehículo:");
            String placa = entrada.nextLine();

            System.out.println("Ingrese el tipo de vehículo:");
            String tipoVehiculo = entrada.nextLine();

            // Tomamos la primera letra de la placa
            char primeraLetra = placa.toUpperCase().charAt(0);

            // Construimos la cadena
            String cadenaFinal = String.format("%s|%s|%s",
                    nombre,
                    placa,
                    tipoVehiculo);

            // Decidimos el archivo usando if (sin Pichincha)
            String archivoDestino;
            if (primeraLetra == 'L') {
                archivoDestino = "data/Loja.txt";
            } else if (primeraLetra == 'G') {
                archivoDestino = "data/Guayas.txt";
            } else {
                archivoDestino = "data/Otros.txt";
            }

            guardar.agregarRegistros(cadenaFinal, archivoDestino);

            System.out.println("¿Desea ingresar otro registro? (s/n)");
            String respuesta = entrada.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("Programa terminado.");
    }
}