package lvchi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Nieves_Briones_Victor_AD_Ej1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("No hay un número de argumentos correcto");
            System.exit(1);
        }
        File ficheroEntrada = new File(args[0]);
        File ficheroSalida = new File(args[1]);
        FileInputStream ent = null;
        FileOutputStream sal = null;
        try {
            ent = new FileInputStream(ficheroEntrada);
            sal = new FileOutputStream(ficheroSalida);
            int Byte = 0;
            while ((Byte = ent.read()) != -1) {
                sal.write(Byte);
            }
        } catch (FileNotFoundException e) {
            System.err.println("El fichero no se encontró: " + e.getMessage());
            System.exit(2);
        } catch (IOException e) {
            System.err.println("Ha habido un error: " + e.getMessage());
            System.exit(3);
        }
        if (ent != null) {
            try {
                ent.close();
            } catch (IOException e) {
                System.err.println("No se ha podido cerrar: " + e.getMessage());
                System.exit(4);
            }
        }
        if (sal != null) {
            try {
                sal.close();
            } catch (IOException e) {
                System.err.println("No se ha podido cerrar: " + e.getMessage());
                System.exit(5);
            }
        }
        System.out.println("Ha sido todo un exito");
        System.exit(0);
    }
}
