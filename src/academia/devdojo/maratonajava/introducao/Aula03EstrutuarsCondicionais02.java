package academia.devdojo.maratonajava.introducao;

public class Aula03EstrutuarsCondicionais02 {

    //Várias Formas de Operadores Ternários

    public static void main(String[] args) {
        double credito = 0.5; // Saldo de crédito atual do usuário (bem baixo pra testar rejeição)

// Forma tradicional usando if-else
        String creditoUsado = "Confirmação de Compra no seu cartão de Crédito"; // Mensagem de sucesso
        String creditoNegado = "Você não tem saldo para Compra"; // Mensagem de falha
        String mensagem; // Variável que vai armazenar a mensagem final

        if (credito >= 5000) {
            mensagem = creditoUsado; // Se o crédito for alto o bastante, aprova a compra
        } else {
            mensagem = creditoNegado; // Senão, nega
        }
        System.out.println(mensagem); // Exibe o resultado da verificação acima


// Forma com operador ternário (mais limpa e curta)
// Aqui, verifica se o crédito é maior ou igual a 250
// Se for, aprova. Senão, nega.
        String resultado = credito >= 250
                ? "Compra Autorizada Com Sucesso"
                : "Não há saldo para Compra";
        System.out.println(resultado);


// Forma direta e menos legível: ternário dentro do próprio print
// Funciona, mas pode confundir se for mais complexo
        System.out.println(
                credito >= 100
                        ? "Compra Feita com sucesso!!!"
                        : "Não foi possível prosseguir com a compra."
        );

    }
}