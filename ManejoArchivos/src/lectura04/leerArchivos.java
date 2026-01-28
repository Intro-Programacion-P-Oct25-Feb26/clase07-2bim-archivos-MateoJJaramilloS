/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class leerArchivos {

    public static void mostrar () {
        double a = 0;
        double b = 0;
        double c = 0;
        int contador = 0;
        try {
            
   

        Scanner entrada = new Scanner(new File("data/datosDos.txt"));
        while (entrada.hasNext()) {  
            String linea = entrada.nextLine();
            List<String> lista = Arrays.asList(linea.split("\\|"));
            ArrayList<String> linea_partes = new ArrayList<>(lista);
            a = a + Double.parseDouble(linea_partes.get(3));
            //b = Double.parseDouble(linea_partes.get(3));
            contador = contador + 1 ;
            }
        c = a/contador;
        
        entrada.close();
        }catch (Exception e) {
            System.err.println("Error que impide leer el archivo");
            System.exit(1);
        }
        
        System.out.printf("El promedio: %.2f",c);
    }
}
