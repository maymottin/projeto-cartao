import model.CartaoDePresente;
import model.DiaDasMaes;
import model.DiaDosNamorados;
import model.Natal;

public class Main {
    public static void main(String[] args){
        DiaDasMaes cartaoMaes = new DiaDasMaes("Jesus", "Maria");
        DiaDosNamorados cartaoNamorados = new DiaDosNamorados("Romeu", "Julieta");
        Natal cartaoNatal = new Natal("Papai Noel","Grinch");

        imprimeCartao(cartaoMaes);
        System.out.println();
        imprimeCartao(cartaoNamorados);
        System.out.println();
        imprimeCartao(cartaoNatal);
    }

    public static void imprimeCartao(CartaoDePresente cartaoDePresente){
                System.out.println(cartaoDePresente.mensagem() +
                "\nDe: " + cartaoDePresente.getNomeRemetente() +
                "\nPara: " + cartaoDePresente.getNomeDestinatario());
    }
}
