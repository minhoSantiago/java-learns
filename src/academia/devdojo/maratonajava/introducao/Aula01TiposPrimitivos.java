package academia.devdojo.maratonajava.introducao;

public class Aula01TiposPrimitivos {
    public static void main (String[]args){
        /*Tipos Primitivos:
        int - 4 bytes | -2147483648 até 2147483647
        double - 8 bytes | 1.7e-308 até 1.7e+038
        float - 4 bytes | 3.4e-038 até 3.4e+038
        char - 2 bytes | 'M' ou 100
        byte - 1 byte | -128 até 127
        short - 2 bytes | -32768 até 32757
        long - 8 bytes | -9223372036854775808 até 9223372036854750000
        boolean - 1 bit | true ou false
        */
        // 1 byte = 8 bits

        //para fazer Casting.


        //int idade = 100;
        int idade = (int) 1000000000000000000L;
        //long numeroGrande = 1000000000000000000L;
        long numeroGrande = (long) 125.35;
        double salarioDouble = 2000.0;
        float salarioFloat = 2000;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdade = true;
        boolean falso = false;
        char letra = 'a';

        String olhaElaAqui = "mano string nn é primitivo é uma classe por isso começa com S maiusculo e não minusculo";


        System.out.println(idade);
        System.out.println(numeroGrande);
        System.out.println(olhaElaAqui);
  }
}
