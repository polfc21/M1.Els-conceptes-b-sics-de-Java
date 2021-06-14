package nivell3;

public class Nivell3 {
    public static void main(String[] args) {
        int[] arrayNumeros = {1,2,3,4,5,6,7,8,9,10};
        int variableAux = arrayNumeros[arrayNumeros.length-1];
        for (int i = 0; i < arrayNumeros.length; i++){
            arrayNumeros[i] = variableAux;
            System.out.print(arrayNumeros[i]+ " ");
            variableAux--;
        }
    }
}
