package academia.devdojo.maratonajava.javaCore.AintroducaoClasses.teste;
import academia.devdojo.maratonajava.javaCore.AintroducaoClasses.domain.Professor;


public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Julio";
        professor.idade = 29;
        professor.sexo = 'M';


        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo );
    }
}