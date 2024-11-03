package mx.unam.fi.poo.g1.p11_T;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase Archivo.
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
 */
public class Archivo {
    /**
     * Método que lee el contenido de 3 archivos especificados 
     * y escribe su contenido en un archivo de salida (cuarto
     * archivo).
     */
    public void leerArchivo() {
        ArrayList<String> archivos = new ArrayList<>();
        archivos.add("archivo1.txt");
        archivos.add("archivo2.txt");
        archivos.add("archivo3.txt");

        // Ruta del archivo de salida
        String filename = "C:/Users/ferge/OneDrive/Escritorio/POOCodigos/Practica11/P11_T/archivoSalida.txt";

        // Aquí se escribe en el archivo de salida.
        try (FileWriter fw = new FileWriter(filename, false)) {
            for (String archivo : archivos) {
                System.out.println("\nLeyendo archivo --> " + archivo);

                // Aquí se lee el contenido de los archivos.
                try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                    String strLine;
                    while ((strLine = br.readLine()) != null) {
                        fw.write(strLine + "\n");
                        System.out.println(strLine);
                    }
                } catch (IOException e) {
                    System.out.println("Error --> no fue posible leer el archivo " + archivo);
                }
            }
        } catch (IOException e) {
            System.out.println("Error --> no fue posible escribir en el archivo de salida...");
        }

        imprimirArchivoSalida();
    }

    /**
     * Método que imprime el contenido del archivo de salida (archivo que contiene el contenido de 3 archivos).
     */
    private void imprimirArchivoSalida() {
        String filename = "C:/Users/ferge/OneDrive/Escritorio/POOCodigos/Practica11/P11_T/archivoSalida.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String strLine;
            System.out.println("\nContenido --> Archivo de salida:");
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
        } catch (IOException e) {
            System.out.println("Error --> no fue posible leer el archivo de salida...");
        }
    }
}
