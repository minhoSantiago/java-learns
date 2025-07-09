package academia.devdojo.maratonajava.introducao;

public class DiaUtilouFDS {
    public static void main(String[] args) {


        byte dia = 7;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana!!!!");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Inválido");
                break;


                /*
                A partir do Java 14 a gente tem o switch expression, segue como ficaria a resolução do exercicio:
                switch (dia) {
	            case 1, 7 -> System.out.println("Fim de semana");
	            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
	            default -> throw new IllegalArgumentException("Unexpected value: " + dia);
	            }*/
        }
    }
}
