import Model.Ex06.Mensagem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex06");

        Mensagem notify = new Mensagem();

        notify.enviarMessage();
        notify.enviarMessage("João", "Bom dia!");
        notify.enviarMessage("Maria", "Atenção!", 2);

    }
}