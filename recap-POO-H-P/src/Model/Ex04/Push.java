package Model.Ex04;

public class Push extends Notificacao{

    private String title;

    public Push(String destinatario,String title ,String mensagem) {
        super(destinatario, mensagem);
        this.title = title;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Push para: " + getDestinatario());
        System.out.println("Título: " + title);
        System.out.println("Conteúdo: " + getMensagem());

    }
}
