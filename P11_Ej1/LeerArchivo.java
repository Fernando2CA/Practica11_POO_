package mx.unam.fi.poo.g1.p11_Ej1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public void leerArchivo() {
        String strLine = "";
        String str_data = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader("/C:/Users/ferge/OneDrive/Escritorio/POOCodigos/Practica11/P11_Ej1/test.txt"));
            while (strLine != null) {
                str_data += strLine;
                strLine = br.readLine();
            }
            System.out.println(str_data);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch(IOException e){
            System.err.println("No es posible leer el archivo...");
        }
    }
}
