package model;

public class DiaDosNamorados extends CartaoDePresente{
    public DiaDosNamorados(String remetente, String destinatario){
        super(remetente, destinatario);
    }

    @Override
    public String mostrarMensagem(){
        return "Feliz Dia dos Namorados! Você é o amor da minha vida!";
    };
}
