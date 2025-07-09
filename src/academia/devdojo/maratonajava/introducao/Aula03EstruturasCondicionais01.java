package academia.devdojo.maratonajava.introducao;

public class Aula03EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15; // Idade da pessoa sendo verificada

// Verifica se a pessoa tem 18 anos ou mais e guarda o resultado (true ou false)
        boolean isAutorizadoComprarBebida = idade >= 18;

// Operador ! (NOT) inverte o valor booleano — se for true vira false, e vice-versa

// Condicional padrão: se a pessoa for maior de idade
        if (isAutorizadoComprarBebida) {
            System.out.println("Você é Maior de idade, pode comprar bebida alcólica");
        } else {
            // Se for menor de idade, cai aqui
            System.out.println("Você não pode comprar bebida alcolica");
        }

/*
// Alternativa usando negação direta na condição
if (!isAutorizadoComprarBebida) {
    System.out.println("Você não pode comprar bebida alcolica");
}
*/
    }
}