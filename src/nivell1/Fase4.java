package nivell1;

public class Fase4 {
    public static void main(String[] args) {
        String nom = "Lionel", cognom1 = "Messi", cognom2 = "Cuccittini";
        String nomComplet = nom + " " + cognom1 + " " + cognom2;
        int dia = 24, mes = 6, any = 1987;
        String dataNaix = dia+"/"+mes+"/"+any;
        String anyTraspas = "L'any " + any + " és un any de traspàs";
        String anyNoTraspas = "L'any " + any + " no és un any de traspàs";
        boolean traspas;
        if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))) traspas = true;
        else traspas = false;
        System.out.println("El meu nom és " + nomComplet);
        System.out.println("Vaig nèixer el " + dataNaix);
        if (traspas) System.out.println(anyTraspas);
        else System.out.println(anyNoTraspas);
    }
}
