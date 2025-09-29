package lvchi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeoFicheros {
    public static void main(String[] args) {
        if (args.length!=2){
            System.err.println("No hay un numero de argumentos correcto");
        }
        File ficheroEntrada = new File(args[0]);
        File ficheroSalida = new File(args[1]);
        FileInputStream ent = null;
        FileOutputStream sal = null;
        try {
            ent = new FileInputStream(ficheroEntrada);
            sal = new FileOutputStream(ficheroSalida);
            int myByte = 0;
            while ((myByte = ent.read()) != -1) {
                sal.write(myByte);
            }
        } catch (FileNotFoundException e) {
            System.err.println("El fichero no se encontro: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ha habido un error: " + e.getMessage());
        }
        if (ent != null) {
            try {
                ent.close();
            } catch (IOException e) {
                System.err.println("No se ha podido cerrar: " + e.getMessage());
            }
        }
        if (sal != null) {
            try {
                sal.close();
            } catch (IOException e) {
                System.err.println("No se ha podido cerrar: " + e.getMessage());
            }
        }
    }
}

