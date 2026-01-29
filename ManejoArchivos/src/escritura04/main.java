/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;

import java.util.Scanner;
import java.util.Formatter;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese su apellido");
            String apellido = entrada.nextLine();

            System.out.println("Ingrese su cédula");
            String cedula = entrada.nextLine();

            cadenaFinal = String.format("%s|%s|%s|%s\n", cadenaFinal,
                    nombre,
                    apellido,
                    cedula);

            guardar.agregarRegistros(cadenaFinal, cedula);

            System.out.println("¿Desea ingresar otro registro? (s/n)");
            String respuesta = entrada.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("Programa terminado.");
    }
}

