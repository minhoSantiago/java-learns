package academia.devdojo.maratonajava.introducao;

public class ImpaOuPar {
    public static void main(String[] args) {

        int n1 = 15;
        int n2 = 2;
        int n3 = n1%n2;

        boolean resultado;
        if (n3 == 0) {
            System.out.println("Seu número é Par");
        }else{
            System.out.println("Seu número é Ímpar");
        }
    }
}
