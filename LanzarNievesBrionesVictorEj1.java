package lvchi;

public class LanzarNievesBrionesVictorEj1 {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "lvchi.Nieves_Briones_Victor_AD_Ej1", "entrada.txt", "salida.txt");
            Process proceso = pb.start();
            int codigo = proceso.waitFor();
            System.out.println("Código de salida: " + codigo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
