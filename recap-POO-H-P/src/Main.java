import Model.Ex01.Aluno;
import Model.Ex01.Bolsista;

class Main{
    public static void main(String[] args) {
        System.out.println("EX01");

        Aluno student = new Aluno("Gabriel Inácio","regular");
        Bolsista student2 = new Bolsista("João da Silva");

        student.identificar();
        student.identificar();
    }
}