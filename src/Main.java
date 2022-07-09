import model.CartaoDePresente;
import model.DiaDasMaes;
import model.DiaDosNamorados;
import model.Natal;

public class Main {
    public static void main(String[] args){
        DiaDasMaes cartaoMaes = new DiaDasMaes("Norman", "Norma");
        DiaDosNamorados cartaoNamorados = new DiaDosNamorados("Romeu", "Julieta");
        Natal cartaoNatal = new Natal("Papai Noel","Grinch");

        imprimeMensagem(cartaoMaes);
        System.out.println();
        imprimeMensagem(cartaoNamorados);
        System.out.println();
        imprimeMensagem(cartaoNatal);
    }

    public static void imprimeMensagem(CartaoDePresente cartaoDePresente){
                System.out.println(cartaoDePresente.mostrarMensagem() +
                "\nDe: " + cartaoDePresente.getNomeRemetente() +
                "\nPara: " + cartaoDePresente.getNomeDestinatario());
    }
}
