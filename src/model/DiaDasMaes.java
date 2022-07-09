package model;

public class DiaDasMaes extends CartaoDePresente{
    public DiaDasMaes(String remetente){
        super(remetente, "Mãe");
    }

    @Override
    public String mensagem(){
        return "Feliz Dia das Mães! Te amo muito, mamãe!";
    };
}
