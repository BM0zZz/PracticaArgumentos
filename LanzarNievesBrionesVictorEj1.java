package lvchi;

import java.io.File;

public class LanzarNievesBrionesVictorEj1 {
    public static void main(String[] args) {
        File ficheroEntrada = new File(args[0]);
        File ficheroSalida = new File(args[1]);
        String laClase = "Actividad1Bytes.Nieves_Briones_Victor_AD_Ej1";
        try {
            ProcessBuilder pb = new ProcessBuilder("java", laClase, ficheroEntrada.getPath(), ficheroSalida.getPath());
            Process proceso = pb.start();
            int codigo = proceso.waitFor();
            System.out.println("Código de salida: " + codigo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
