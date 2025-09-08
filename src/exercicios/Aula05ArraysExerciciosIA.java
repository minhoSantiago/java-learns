package exercicios;

public class Aula05ArraysExerciciosIA {
    public static void main(String[] args) {

        // Crie um array com 10 números inteiros e mostre apenas os números pares
        int[] numeros = new int[10];
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
            if (numeros[i] % 2 == 0) { // se for par
                System.out.println(numeros[i]);
            }
        }

        // Guarde 5 nomes em um array e exiba-os na ordem inversa
        String[] nomes = new String[]{"Monica", "Cebolinha", "Cascão", "Magali", "Franjinha"};
        for (int j = nomes.length - 1; j >= 0; j--) {
            System.out.println(nomes[j]);
        }

        // Cálculo de média de 7 números usando foreach
        double soma = 0.0;
        double[] notas = new double[]{6, 7, 4, 9, 10, 4, 9};
        for (double nota : notas) {
            soma += nota;
        }
        System.out.println("Média: " + (soma / notas.length));

        // Armazene 10 números e mostre qual é o maior e o menor
        int[] number = new int[]{1, 2, 23, 4, 15, 6, 7, 68, 9, 10};
        int maior = number[0];
        int menor = number[0];
        for (int i : number) {
            if (i > maior) {
                maior = i;
            }
            if (i < menor) {
                menor = i;
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}