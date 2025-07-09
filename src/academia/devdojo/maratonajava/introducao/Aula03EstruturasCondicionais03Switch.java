package academia.devdojo.maratonajava.introducao;

public class Aula03EstruturasCondicionais03Switch {
    public static void main(String[] args) {
        // Imprimir o dia da semana, considerando 1 como domigo
    byte dia = 8;
        // char, int, byte, short, enum, string
    switch (dia){

        //breack é para que ele pare, caso não tivesse ele iria dizer Quinta, Sexta, Sabado
        //por padrão o impresso será o default, pois pode não bater com nenhum número selecionado.

        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda");
            break;
        case 3:
            System.out.println("Terça");
            break;
        case 4:
            System.out.println("Quarta");
            break;
        case 5:
            System.out.println("Quinta");
            break;
        case 6:
            System.out.println("Sexta");
            break;
        case 7:
            System.out.println("Sabado");

        default:
            System.out.println("Número não corresponde.");
    }
    }
}
