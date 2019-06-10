/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Usuario
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
       public static void leerRegistrosdegolesypeso() {

        // TODO code application logic here
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/stadic.csv"));
            int cont = 0;
            double suma = 0;
            double suma2 = 0;
            double prom1;
            double prom2;
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split("\\|")));

                double dato = Double.parseDouble(linea_partes.get(11));
                double dato2 = Double.parseDouble(linea_partes.get(9));
                suma = suma + dato;
                suma2 = suma2 + dato2;
                cont = cont + 1;
            } // fin de while
            prom1 = suma/ cont;
            prom2 = suma2 / cont;
            System.out.printf("El promedio de peso es de: %.2f\n",prom1);
            System.out.printf("El promedio de goles es de: %.2f",prom2);
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
     // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

} // fin de la clase LeerArchivoTexto
}
    

