package model;

public class Natal extends CartaoDePresente{
    public Natal(String remetente, String destinatario){
        super(remetente, destinatario);
    }

    @Override
    public String mensagem(){
        return "Feliz Natal! E ótimo Ano Novo também!";
    };
}
