package mx.unam.fi.poo.g1.p11_Ej0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class LeerArchivo {
    public void leerArchivo(){
        StringBuilder sb = new StringBuilder();
        String strLine = " ";

        try {
            BufferedReader br = new BufferedReader(new FileReader("/C:/Users/ferge/OneDrive/Escritorio/POOCodigos/Practica11/P11_Ej0/test.txt"));
            while(strLine != null){
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if(strLine == null) break;
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch (IOException e) {
            System.err.println("No es posible leer el archivo...");
        }
    }

}
