package Model.Ex02;

public class Aluno extends Pessoa implements ShowDetails{

    private double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        validarNota(nota);
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluno: " + getNome() + " - Idade: " + getIdade() + " - Nota: " + nota);
    }

    private void validarNota(double nota){
        if(nota < 0 || nota > 10){
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
        this.nota = nota;
    }
}
