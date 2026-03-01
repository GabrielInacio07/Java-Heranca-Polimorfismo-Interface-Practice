import Model.Ex04.Email;
import Model.Ex04.Notificacao;
import Model.Ex04.Push;
import Model.Ex04.SMS;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex04");

        Notificacao email = new Email("gabriel@email.com", "Bem-vindo", "Sua conta foi criada.");
        Notificacao sms = new SMS("44999999999", "Código de verificação: 1234");
        Notificacao push = new Push("Gabriel", "Promoção", "Você recebeu um desconto!");

        email.enviar();
        System.out.println("-----");

        sms.enviar();
        System.out.println("-----");

        push.enviar();
    }
}