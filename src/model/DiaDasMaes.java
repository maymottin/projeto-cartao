package model;

public class DiaDasMaes extends CartaoDePresente{
    public DiaDasMaes(String remetente, String destinatario){
        super(remetente, destinatario);
    }

    @Override
    public String mensagem(){
        return "Feliz Dia das Mães! Te amo muito, mamãe!";
    };
}
