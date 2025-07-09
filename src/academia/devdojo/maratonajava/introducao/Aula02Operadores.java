package academia.devdojo.maratonajava.introducao;

public class Aula02Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos Básicos: +, -, /, *
/* Divisão entre dois inteiros sempre retorna inteiro
   Ex: 10 / 20 = 0 (porque corta a parte decimal)
   Pra ter resultado decimal, usa-se pelo menos um número do tipo double */
        int n1 = 10;
        double n2 = 20;
        double n3 = n1 / n2; // Vai resultar em 0.5, pois n2 é double
//System.out.println("Valor " + n3);

// Operador de Resto (%): retorna o que sobra da divisão
// Ex: 10 % 3 = 1 (pois 3*3 = 9, sobra 1)

// Operadores de Comparação: retornam booleano (true/false)
// <, >, <=, >=, == (igual), != (diferente)
        boolean isDezMenorQueVinte = 10 < 20;
//System.out.println(isDezMenorQueVinte); // true

// Operadores Lógicos: combinam condições
// && = E, || = OU, ! = NÃO
        int idade = 29;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
// false && false → false

        boolean isDentroDaLeiMenorQueTrinta = idade < 30 || salario >= 3381;
// true || true → true
/*System.out.println(isDentroDaLeiMaiorQueTrinta);
System.out.println(isDentroDaLeiMenorQueTrinta);*/

// Exemplo prático com OR (||): pode comprar o PS5 se alguma das contas tiver saldo suficiente
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 15000;
        float valorPlaystation = 4099;

        boolean isPlaystation5Compravel =
                valorTotalContaCorrente > valorPlaystation
                        || valorTotalContaPoupança > valorPlaystation;
//System.out.println(isPlaystation5Compravel); // true

// Operadores de Atribuição: usados pra atualizar valores
// += (soma e atribui), -=, *=, /=, %=

        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;    // 3600
        bonus /= 2;    // 1800
        bonus %= 2;    // 0 (1800 dividido por 2 sobra 0)
//System.out.println(bonus);

// Operadores de incremento: ++ (aumenta em 1), -- (diminui em 1)
        int contador = 0;
        contador++; // pós-incremento: soma depois
        ++contador; // pré-incremento: soma antes
//System.out.println(contador); // 2

// Diferença entre pós e pré-incremento
        int contador2 = 0;
        int contador3 = 0;

        System.out.println(contador2++); // imprime 0, depois soma → contador2 = 1
        System.out.println(contador2);   // agora vale 1
        System.out.println(++contador3); // soma antes, então imprime 1 direto
    }
}