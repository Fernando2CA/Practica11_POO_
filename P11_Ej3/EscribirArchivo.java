package mx.unam.fi.poo.g1.p11_Ej3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class EscribirArchivo {
    public void leerYescribirArchivo() {
        StringBuilder sb = new StringBuilder();
        String strLine = "";


        try {
            String filename = "/C:/Users/ferge/OneDrive/Escritorio/POOCodigos/Practica11/P11_Ej3/miArchivo.txt";
            FileWriter fw = new FileWriter(filename, false);
            fw.write("Esto es un ejemplo de escritura de un archivo...");
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("/C:/Users/ferge/OneDrive/Escritorio/POOCodigos/Practica11/P11_Ej3/miArchivo.txt"));
            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine == null) break;
                System.out.println(strLine);
            }
            br.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
