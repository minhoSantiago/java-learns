package academia.devdojo.maratonajava.introducaoClasses.teste;

import academia.devdojo.maratonajava.introducaoClasses.domain.Personagem;

public class personagemTeste1 {
    public static void main(String[] args) {
        Personagem giomey = new Personagem();
            giomey.nome = "Gyomei Himejima";
            giomey.idade = 25;
            giomey.animacao = "Demon Slayer";
        System.out.println(giomey.nome);
        System.out.println(giomey.idade);
        System.out.println(giomey.animacao);
    }
}
