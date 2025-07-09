package academia.devdojo.maratonajava.introducao;

public class Aula04EstruturasDeRepeticao03Breack {
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax ; i++) {
            if (i == 26){
                break;
            }
            System.out.println(i);
        }

    }
}
