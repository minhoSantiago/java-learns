package academia.devdojo.maratonajava.javaCore.AintroducaoClasses.exercicioClasses.teste;
import academia.devdojo.maratonajava.javaCore.AintroducaoClasses.exercicioClasses.domain.Carros;

public class main {
    public static void main(String[] args) {
        Carros sandero = new Carros();
        sandero.nome="Sandero";
        sandero.modelo="Vibe";
        sandero.ano=2017;


        System.out.println("Nome: "+sandero.nome);
        System.out.println("Marca: "+sandero.modelo);
        System.out.println("Do ano de: "+sandero.ano);

        System.out.println("----------------------------------------");

        Carros mitsubishi = new Carros();
        mitsubishi.nome="Mitsubishi";
        mitsubishi.modelo="Eclipse Cross";
        mitsubishi.ano=2017;
        System.out.println("Nome: "+mitsubishi.nome);
        System.out.println("Marca: "+mitsubishi.modelo);
        System.out.println("Do ano de: "+mitsubishi.ano);

    }
}
