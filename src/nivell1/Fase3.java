package nivell1;

public class Fase3 {
    public static void main(String[] args) {
        int anyNaix = 1987;
        String anyTraspas = "L'any " + anyNaix + " és un any de traspàs";
        String anyNoTraspas = "L'any " + anyNaix + " no és un any de traspàs";
        boolean traspas;
        if ((anyNaix % 4 == 0) && ((anyNaix % 100 != 0) || (anyNaix % 400 == 0))) traspas = true;
        else traspas = false;
        if (traspas) System.out.println(anyTraspas);
        else System.out.println(anyNoTraspas);
    }
}
