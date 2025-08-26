package academia.devdojo.maratonajava.introducao;

public class Aula05Arrays02 {
    public static void main(String[] args) {
        /* AULA 02
        //byte, short, int, long, float e double o padrão é 0
        //char o padrão é 'ul000' ou ' '
        //boolean o padrão é falso
        //String o padrão é null (assim como todos os tipos Reference)

        String[] nomes = new String[3];
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        */

        //AULA 03

        String[] nomes = new String[3];
        nomes[0] = "Anderson";
        nomes[1] = "Douko";
        nomes[2] = "Giulian";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
            
        }
    }
}
