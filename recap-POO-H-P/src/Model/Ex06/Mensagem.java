package Model.Ex06;

public class Mensagem {

    public void enviarMessage() {
        System.out.println("Mensagem enviada para todos: Olá!");
    }

    public void enviarMessage(String nome, String mensagemPersonalizada) {
        System.out.println("Mensagem para " + nome + ": " + mensagemPersonalizada);
    }

    public void enviarMessage(String nome, String mensagemPersonalizada, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Mensagem para " + nome + ": " + mensagemPersonalizada);
        }
    }
}