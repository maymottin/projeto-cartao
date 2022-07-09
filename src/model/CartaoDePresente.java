package model;

public abstract class CartaoDePresente {
    private final String nomeRemetente;
    private final String nomeDestinatario;

    public CartaoDePresente(String remetente, String destinatario){
        this.nomeRemetente = remetente;
        this.nomeDestinatario = destinatario;
    }

    public String getNomeRemetente(){
        return nomeRemetente;
    }

    public String getNomeDestinatario(){
        return nomeDestinatario;
    }

    public abstract String mostrarMensagem();

}
