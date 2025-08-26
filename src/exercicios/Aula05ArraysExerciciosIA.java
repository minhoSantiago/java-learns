package exercicios;

public class Aula05ArraysExerciciosIA {
    public static void main(String[] args) {
        //Crie um array com 10 números inteiros e mostre apenas os números pares

        int [] numeros = new int[10];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 != 0){
                System.out.println(numeros[i]);
            }
        }

    }
}
