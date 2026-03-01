import Model.Ex02.Aluno;
import Model.Ex02.Docente;

class Main{
    public static void main(String[] args) {
        System.out.println("EX02");

        Aluno student = new Aluno("Gabriel Inácio",21,12);
        Docente docente = new Docente("João da Silva",45,"Linguagem de programação");

        student.exibirDados();
        docente.exibirDados();
    }
}