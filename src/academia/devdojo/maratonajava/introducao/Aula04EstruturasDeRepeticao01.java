package academia.devdojo.maratonajava.introducao;

public class Aula04EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // While, do While, for

        int conta = 0;
        while(conta < 10) {
            System.out.println(++conta + " while"); // 1 -> 10
            //conta += 1; -> 0 á 9
            //conta = conta+1; -> 0 á
        }
            conta = 0; //isso é só para ver rodando o do-While.

            //Diferent do While, do-While executará pelo menos uma vez. Menos usado na vida real.
            do {
                System.out.println(++conta + " do-While");

            } while (conta < 10);

        // For
        for (int i=0;i < 10 ; i++){
            System.out.println(i);
        }
    }

    public static class Aula04EstruturasDeRepeticao03 {
    }
}
