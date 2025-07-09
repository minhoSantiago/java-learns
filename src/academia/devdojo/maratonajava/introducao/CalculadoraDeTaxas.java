package academia.devdojo.maratonajava.introducao;

public class CalculadoraDeTaxas {

    //calculo disso é ValorDaTaxa=salario*(taxa/100)

    public static void main(String[] args) {
        double salario = 45000;
        double taxa = 0;
        if (salario <= 34712){
            taxa = 9.7;
        }else if (salario >=34713 && salario <=68507){
            taxa = 37.35;
        } else{
            taxa = 49.5;
        }
        double ValorDaTaxa = salario*(taxa/100) ;
        System.out.println("Salário Anual: R$" + salario);
        System.out.println("Taxa aplicada: " + taxa + "%");
        System.out.println("Valor da taxa: R$" + ValorDaTaxa);
    }
}



