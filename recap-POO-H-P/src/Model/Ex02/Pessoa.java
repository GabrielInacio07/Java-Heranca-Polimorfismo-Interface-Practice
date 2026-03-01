package Model.Ex02;

public abstract class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        validarIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    private void validarIdade(int idade){
        if(idade < 0){
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }
}
