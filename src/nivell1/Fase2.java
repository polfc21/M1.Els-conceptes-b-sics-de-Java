package nivell1;

public class Fase2 {
    final static int ANY_TRASPAS = 1948;
    public static void main(String[] args) {
        int anysTraspas = 4;
        int nreAnysTraspas = 0;
        int anyNaix = 1987;
        for (int i = ANY_TRASPAS; i < anyNaix; i+=anysTraspas){
            System.out.print(i + " ");
            nreAnysTraspas++;
        }
        System.out.println("\nNombre d'anys de traspàs des de "+ANY_TRASPAS+" fins "+anyNaix+": " + nreAnysTraspas);
    }
}
