/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author User
 */

public class Estadistica {

    public double obtenerPromedioEmpleados(String nombreArchivo) {
        double suma = 0;
        int contadorRegistros = 0;

        try {
            File archivo = new File(nombreArchivo);
            Scanner lector = new Scanner(archivo);

            // Saltar la primera línea (encabezado)
            if (lector.hasNextLine()) {
                lector.nextLine();
            }

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();

                try {
                    String[] datos = linea.split("\\|");

                    if (datos.length < 5) {
                        throw new Exception("Línea incompleta: " + linea);
                    }

                    int empleados = Integer.parseInt(datos[2].trim());

                    suma = suma + empleados;
                    contadorRegistros++;

                } catch (Exception e) {
                    System.out.println("Error procesando registro: " + e.getMessage());
                }
            }
            lector.close();

        } catch (Exception e) {
            System.out.println("Error crítico al leer el archivo: " + e.getMessage());
        }

        if (contadorRegistros > 0) {
            return suma / contadorRegistros;
        } else {
            return 0;
        }
    }
}
