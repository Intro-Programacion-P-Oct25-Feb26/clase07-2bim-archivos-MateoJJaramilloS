/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author User
 */

public class guardar {
    public static void agregarRegistros(String valor, String ruta){
        try{
            FileWriter fw = new FileWriter(ruta, true);
            PrintWriter salida = new PrintWriter (fw);
            salida.println(valor);
            salida.close();
           } catch (Exception e){ 
               System.err.println("Error al crear o escribir en el archivo");
               System.exit(1);
        }
        
    }
}

